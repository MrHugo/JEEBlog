package dao;

import beans.Article;
import beans.Blog;
import beans.UserBlog;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class UserBlogDAO {
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<UserBlog> getAllUsers()
    {
        try
        {
            return em.createQuery("FROM userblog").getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
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
}
