package services;

import beans.UserBlog;
import dao.UserBlogDAO;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.ws.rs.*;

/**
 * Created by franzzy on 10/07/17.
 */

@WebService
@Path("/user")
@Produces("application/json; charset=UTF-8")
public class UserBlogService {

    @Inject UserBlogDAO userBlogDAO;

    /*@GET
    @Path("/handshake")
    public String handshake(@Context final HttpServletRequest request)
    {

    }*/

    /*@PUT
    @Path("/token")
    @Consumes("application/json")
    public void token(final String content) throws IOException
    {

    }*/

    @GET
    @Path("/{userId}")
    public UserBlog getUserById(@PathParam("userId") final Integer userId)
    {
        return userBlogDAO.getUserWithId(userId);
    }

    @GET
    @Path("/find/")
    public UserBlog findUser(@QueryParam("username") final String uname, @QueryParam("email") final String email)
    {
        if (uname != null) return userBlogDAO.getUserWithUsername(uname);
        if (email != null) return userBlogDAO.getUserWithMail(email);
        return null;
    }
}
