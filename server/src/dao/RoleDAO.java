package dao;

import beans.Role;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class RoleDAO
{
    @PersistenceContext
    private EntityManager em;

    public Role getRoleForUser(Integer userId)
    {
        try
        {
            List<Role> l = em.createQuery("SELECT r FROM Role WHERE r.user_id=:param")
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
