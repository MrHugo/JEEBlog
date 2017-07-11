package beans;

import dao.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Startup
@Singleton
public class StartBean {

    @Inject ArticleDAO articleDAO;
    @Inject BlogDAO blogDAO;
    @Inject CommentDAO commentDAO;
    @Inject RoleDAO roleDAO;
    @Inject UserBlogDAO userBlogDAO;

    @PostConstruct
    void atStartup()
    {
        System.out.println("Retrieving Articles: \n\n");

        List<Article> list = articleDAO.getAllArticles();
        System.out.println(list.size());
        System.out.println(list);
    }

    @PreDestroy
    void atShutdown() {  }

}
