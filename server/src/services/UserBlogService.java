package services;

import beans.UserBlog;
import dao.UserBlogDAO;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import java.io.IOException;

/**
 * Created by franzzy on 10/07/17.
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
