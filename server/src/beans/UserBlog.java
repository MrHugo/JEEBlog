package beans;

/**
 * Created by franzzy on 10/07/17.
 */
public class UserBlog {

    private Integer id;
    private String username;
    private String email;
    private String password;
    private Integer role_id;

    public UserBlog(Integer id, String username, String email, String password, Integer role_id)
    {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }

    public Integer getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public Integer getRole_id()
    {
        return role_id;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
