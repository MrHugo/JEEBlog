package dao;

import beans.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class ArticleDAO
{
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
