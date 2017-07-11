package dao;

import beans.Comment;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class CommentDAO
{
    @PersistenceContext
    private EntityManager em;

    public List<Comment> getCommentsForArticle(Integer articleId)
    {
        try
        {
            return em.createQuery("FROM Comment WHERE article_id=:param")
                    .setParameter("param", articleId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Comment getCommentWithId(Integer id)
    {
        try
        {
            List<Comment> l = em.createQuery("FROM Comment WHERE id=:param")
                    .setParameter("param", id)
                    .setMaxResults(1)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
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


    @Transactional
    public Boolean updateComment(Comment c)
    {
        try
        {
            em.merge(c);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
