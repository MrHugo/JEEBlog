package services;

import beans.Comment;
import dao.CommentDAO;

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
@Path("/comments")
@Produces("application/json; charset=UTF-8")
public class CommentService {

    @Inject
    CommentDAO commentDAO;


    @GET
    @Path("/{id}")
    public Comment getCommentById(@PathParam("id") final Integer id)
    {
        return commentDAO.getCommentWithId(id);
    }

    @GET
    @Path("/article/{id}")
    public List<Comment> getBlogsForUser(@PathParam("id") final Integer id)
    {
        return commentDAO.getCommentsForArticle(id);
    }
}

