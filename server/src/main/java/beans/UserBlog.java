package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tools.Rot13;

import javax.persistence.*;
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

    public UserBlog() {}

    public UserBlog(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setPassword(final String password)
    {
        this.password = Rot13.apply(password);
    }

    public boolean checkPassword(String pwd)
    {
        return Rot13.apply(pwd).equals(this.password);
    }
}
