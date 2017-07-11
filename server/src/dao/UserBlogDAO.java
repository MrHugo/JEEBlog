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
