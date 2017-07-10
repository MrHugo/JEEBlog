package producers;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class EntityManagerGetter
{
    private static EntityManager em;

    public static EntityManager getEntityManager()
    {
        try
        {
            if (em == null)
            {
                em = Persistence.createEntityManagerFactory("MySqlDS").createEntityManager();
            }
            return em;
        }
        catch (Exception e)
        {
            System.out.println("ERRRRRRROOOOOOOOOOOORRRRRRRRRRRR:");
            e.printStackTrace();
            return null;
        }
    }
}

