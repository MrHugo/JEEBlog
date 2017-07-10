package dao;

import beans.Article;
import beans.Blog;
import beans.Comment;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionException;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class CommentDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<Comment> getCommentsForArticle(Integer articleId)
    {
        try
        {
            return em.createQuery("SELECT c FROM comment WHERE c.article_id=:param")
                    .setParameter("param", articleId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Transactional
    public Boolean insertComment(Comment c)
    {
        try
        {
            em.persist(c);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
