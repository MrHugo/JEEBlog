package dao;

import beans.UserBlog;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Dependent
public class UserBlogDAO {
    @Inject
    private EntityManager em;

    public List<UserBlog> findAll() {
        return em.createQuery("FROM Student").getResultList();
    }
}
