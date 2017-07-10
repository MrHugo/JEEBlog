package dao;

import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class CommentDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();
}
