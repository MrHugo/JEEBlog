package dao;

import beans.article;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Dependent
public class ArticleDAO
{
    @PersistenceContext(name = "MySqlDS")
    private EntityManager em;

    public List<article> getAllArticles()
    {
        try
        {
            //return em.createQuery("FROM article").getResultList();
            javax.persistence.Query aa = em.createQuery("FROM article");
            return aa.getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<article> getArticlesForUser(Integer userId)
    {
        try
        {
            return em.createQuery("SELECT a FROM article WHERE a.user_id=:param")
                    .setParameter("param", userId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Transactional
    public Boolean insertArticle(article a)
    {
        try
        {
            em.persist(a);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
