package dao;

import beans.Article;

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

    public List<Article> getAllArticles()
    {
        try
        {
            javax.persistence.Query aa = em.createQuery("FROM Article");
            return aa.getResultList();

        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Article> getArticlesForUser(Integer userId)
    {
        try
        {
            return em.createQuery("FROM Article WHERE user_id=:param")
                    .setParameter("param", userId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Article> getArticlesForBlog(Integer blogId)
    {
        try
        {
            return em.createQuery("FROM Article WHERE blog_id=:param")
                    .setParameter("param", blogId)
                    .getResultList();
        } catch (Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Article getArticleWithId(Integer id)
    {
        try
        {
            List<Article> l = em.createQuery("FROM Article WHERE id=:param")
                    .setParameter("param", id)
                    .setMaxResults(1)
                    .getResultList();
            return l.get(0);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional
    public Boolean insertArticle(Article a)
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

    @Transactional
    public Boolean updateArticle(Article a)
    {
        try
        {
            em.merge(a);
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
