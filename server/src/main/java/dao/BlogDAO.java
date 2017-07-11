package dao;

import beans.Blog;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class BlogDAO
{
    @PersistenceContext
    private EntityManager em;

    public List<Blog> getAllBlogs()
    {
        try
        {
            return em.createQuery("FROM Blog").getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Blog> getBlogsForUser(Integer userId)
    {
        try
        {
            return em.createQuery("FROM Blog WHERE user_id=:param")
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


    @Transactional
    public Boolean updateBlog(Blog b)
    {
        try
        {
            em.merge(b);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
