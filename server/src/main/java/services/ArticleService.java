package services;

import beans.Article;
import dao.ArticleDAO;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@WebService
@Path("/articles")
@Produces("application/json; charset=UTF-8")
public class ArticleService {

    @Inject
    ArticleDAO articleDAO;

    @GET
    @Path("/")
    public List<Article> getAllBlogs()
    {
        return articleDAO.getAllArticles();
    }

    @GET
    @Path("/{id}")
    public Article getArticleById(@PathParam("id") final Integer id)
    {
        return articleDAO.getArticleWithId(id);
    }

    @GET
    @Path("/user/{id}")
    public List<Article> getArticlesForUser(@PathParam("id") final Integer id)
    {
        return articleDAO.getArticlesForUser(id);
    }

    @GET
    @Path("/blog/{id}")
    public List<Article> getArticlesForBlog(@PathParam("id") final Integer id)
    {
        return articleDAO.getArticlesForBlog(id);
    }
}
