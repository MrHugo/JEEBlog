package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userblog")
public class UserBlog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private Integer role;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();
    @JsonIgnore @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Blog> blogs = new ArrayList<>();
    @JsonIgnore @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Article> articles = new ArrayList<>();


    public UserBlog(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = 0;
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

    public Integer getRole()
    {
        return role;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public List<Blog> getBlogs()
    {
        return blogs;
    }

    public List<Article> getArticles()
    {
        return articles;
    }
}
