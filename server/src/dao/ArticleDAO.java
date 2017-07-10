package dao;

import beans.Article;
import producers.EntityManagerGetter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class ArticleDAO
{
    private EntityManager em = EntityManagerGetter.getEntityManager();

    public List<Article> getAllArticles()
    {
        try
        {
            return em.createQuery("FROM Article").getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
