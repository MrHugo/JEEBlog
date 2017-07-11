package services;

import beans.UserBlog;
import dao.UserBlogDAO;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.ws.rs.*;

/**
 * Created by Valentin Barat on 11/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */

@WebService
@Path("/user")
@Produces("application/json; charset=UTF-8")
public class UserBlogService {

    @Inject UserBlogDAO userBlogDAO;

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
