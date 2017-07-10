package producers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerProducer
{

    @Produces @producers.EntityManager @ApplicationScoped
    public EntityManager createEntityManager()
    {
        return Persistence.createEntityManagerFactory("MySqlDS").createEntityManager();
    }

    public void closeEntityManager(@Disposes @producers.EntityManager EntityManager manager)
    {
        manager.close();
    }
}
