package beans;

import dao.ArticleDAO;
import dao.BlogDAO;
import dao.CommentDAO;
import dao.UserBlogDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Startup
@Singleton
public class StartBean {

    @Inject
    ArticleDAO articleDAO;
    @Inject BlogDAO blogDAO;
    @Inject CommentDAO commentDAO;
    @Inject UserBlogDAO userBlogDAO;

    @PostConstruct
    void atStartup()
    {
        //userBlogDAO.insertUser(new UserBlog("dliix", "barat_v@epita.fr", "pwd"));

        /*UserBlog u = userBlogDAO.getUserWithMail("barat_v@epita.fr");
        u.setPassword("password");
        userBlogDAO.updateUser(u);*/

        /*blogDAO.insertBlog(new Blog("my first blog", u));
        Blog b = blogDAO.getBlogsForUser(u.getId()).get(0);

        articleDAO.insertArticle(new Article("my first article", u, b));*/
        //Article a = articleDAO.getArticlesForUser(u.getId()).get(0);

        //commentDAO.insertComment(new Comment(u, a, "My first comment"));
    }

    @PreDestroy
    void atShutdown() {  }

}
