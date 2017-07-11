package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blog
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @ManyToOne
    private UserBlog user;
    @JsonIgnore @OneToMany
    private List<Article> articles = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UserBlog getUser() {
        return user;
    }

    public void setUser(final UserBlog user) {
        this.user = user;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
