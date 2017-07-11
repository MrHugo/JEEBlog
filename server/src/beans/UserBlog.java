package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserBlog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    @OneToOne
    private Role role;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();
    @JsonIgnore @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Blog> blogs = new ArrayList<>();
    @JsonIgnore @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<article> articles = new ArrayList<>();

}
