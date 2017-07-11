package beans;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private UserBlog user;
    @Column
    private Boolean is_admin;
}
