package dao;

import beans.Article;
import beans.Blog;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class BlogDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<Blog> getAllBlogs()
    {
        try
        {
            return em.createQuery("FROM blog").getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Article> getBlogsForUser(Integer userId)
    {
        try
        {
            return em.createQuery("SELECT b FROM blog WHERE b.user_id=:param")
                    .setParameter("param", userId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Transactional
    public Boolean insertBlog(Blog b)
    {
        try
        {
            em.persist(b);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
