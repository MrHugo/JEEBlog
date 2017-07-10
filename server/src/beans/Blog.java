package beans;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class Blog
{
    private Integer id;
    private String name;
    private Integer user_id;

    public Blog(Integer id, String name, Integer user_id)
    {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
    }

    public Integer getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Integer getUserId()
    {
        return user_id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
