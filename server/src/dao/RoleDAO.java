package dao;

import beans.Role;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class RoleDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<Role> findAll() {
        return em.createQuery("FROM Role").getResultList();
    }

}
