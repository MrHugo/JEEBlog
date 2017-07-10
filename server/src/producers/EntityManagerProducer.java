package producers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.concurrent.ExecutionException;

/*public class EntityManagerProducer
{

    @Produces @producers.EntityManager @ApplicationScoped
    public EntityManager createEntityManager()
    {
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MySqlDS");
            return emf.createEntityManager();
        }
        catch (Exception e) { e.printStackTrace(); return null; }
    }

    public void closeEntityManager(@Disposes @producers.EntityManager EntityManager manager)
    {
        manager.close();
    }
}*/
