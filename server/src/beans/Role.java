package beans;

import javax.persistence.*;

@Entity
public class Role
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private UserBlog user;
    @Column
    private Boolean is_admin;

    public Integer getId() {
        return id;
    }

    public UserBlog getUser() {
        return user;
    }

    public void setUser(final UserBlog user) {
        this.user = user;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(final Boolean is_admin) {
        this.is_admin = is_admin;
    }

}
