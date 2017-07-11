package dao;

import beans.UserBlog;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class UserBlogDAO {
    @PersistenceContext
    private EntityManager em;

    public List<UserBlog> getAllUsers()
    {
        try
        {
            return em.createQuery("FROM UserBlog").getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public UserBlog getUserWithMail(String email)
    {
        try
        {
            List<UserBlog> l = em.createQuery("SELECT b FROM UserBlog b WHERE b.email=:param")
                    .setParameter("param", email)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public UserBlog getUserWithUsername(String uname)
    {
        try
        {
            List<UserBlog> l = em.createQuery("SELECT b FROM UserBlog b WHERE b.username=:param")
                    .setParameter("param", uname)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public UserBlog getUserWithId(Integer id)
    {
        try
        {
            List<UserBlog> l = em.createQuery("SELECT b FROM UserBlog b WHERE b.id=:param")
                    .setParameter("param", id)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional
    public Boolean insertUser(UserBlog u)
    {
        try
        {
            em.persist(u);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Transactional
    public Boolean updateUser(UserBlog u)
    {
        try
        {
            em.merge(u);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
