package services;

import beans.Blog;
import dao.BlogDAO;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@WebService
@Path("/blogs")
@Produces("application/json; charset=UTF-8")
public class BlogService {

    @Inject
    BlogDAO blogDAO;

    @GET
    @Path("/")
    public List<Blog> getAllBlogs()
    {
        return blogDAO.getAllBlogs();
    }

    @GET
    @Path("/{id}")
    public Blog getBlogById(@PathParam("id") final Integer id)
    {
        return blogDAO.getBlogWithId(id);
    }

    @GET
    @Path("/user/{id}")
    public List<Blog> getBlogsForUser(@PathParam("id") final Integer id)
    {
        return blogDAO.getBlogsForUser(id);
    }
}
