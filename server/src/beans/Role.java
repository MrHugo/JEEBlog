package beans;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class Role
{
    private Integer id;
    private Integer user_id;
    private Boolean is_admin;

    public Role(Integer id, Integer user_id, Boolean is_admin)
    {
        this.id = id;
        this.user_id = user_id;
        this.is_admin = is_admin;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getUserId()
    {
        return user_id;
    }

    public Boolean getIsAdmin()
    {
        return is_admin;
    }

    public void setIsAdmin(Boolean is_admin)
    {
        this.is_admin = is_admin;
    }
}
