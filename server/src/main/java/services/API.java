package services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Created by Valentin Barat on 11/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@ApplicationPath("/api")
public class API extends Application
{
    @Override
    public Set<Class<?>> getClasses() {
        return getRestResourceClasses();
    }
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?
                >>();
        resources.add(ArticleService.class);
        resources.add(BlogService.class);
        resources.add(CommentService.class);
        resources.add(UserBlogService.class);
        return resources;
    }
}
