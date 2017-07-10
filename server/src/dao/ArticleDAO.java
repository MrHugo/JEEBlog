package dao;

import beans.Article;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Dependent
public class ArticleDAO
{
    @Inject
    @producers.EntityManager
    private EntityManager em;

    public List<Article> getAllArticles()
    {
        try
        {
            ArrayList<Article> list = new ArrayList<>();

            

            return list;
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
