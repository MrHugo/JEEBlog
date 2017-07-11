package dao;

import beans.Article;
import beans.Blog;
import beans.Role;
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
public class RoleDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public Role getRoleForUser(Integer userId)
    {
        try
        {
            List<Role> l = em.createQuery("SELECT r FROM role WHERE r.user_id=:param")
                    .setParameter("param", userId)
                    .setMaxResults(1)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
