package dao;

import beans.UserBlog;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Dependent
public class UserBlogDAO {
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<UserBlog> findAll() {
        return em.createQuery("FROM U").getResultList();
    }
}
