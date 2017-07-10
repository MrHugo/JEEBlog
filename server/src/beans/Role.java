package beans;

import com.sun.istack.internal.NotNull;
import javax.persistence.*;

@Entity
public class Role
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull @OneToOne
    private UserBlog user;
    @NotNull @Column
    private Boolean is_admin;
}
