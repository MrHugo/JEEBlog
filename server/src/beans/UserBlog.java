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
    private List<Article> articles = new ArrayList<>();

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

    public void setPassword(final String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
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

}
