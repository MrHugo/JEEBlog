package beans;

import dao.ArticleDAO;
import org.primefaces.component.log.Log;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.List;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
@Startup
@Singleton
public class StartBean {

    @PostConstruct
    void atStartup()
    {
        System.out.println("Retrieving Articles: \n\n");
        List<Article> list = new ArticleDAO().getAllArticles();
        System.out.println(list.size());
        System.out.println(list);
    }

    @PreDestroy
    void atShutdown() {  }

}
