package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Article
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Blog blog;
    @Column
    private String content;
    @ManyToOne
    private UserBlog user;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Comment> comments= new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(final Blog blog) {
        this.blog = blog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public UserBlog getUser() {
        return user;
    }

    public void setUser(final UserBlog user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
