package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "article")
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

    public Article() {}

    public Article(final String content, final UserBlog user, final Blog blog)
    {
        this.content = content;
        this.user = user;
        this.blog = blog;
    }

    public Integer getId()
    {
        return id;
    }

    public Blog getBlog()
    {
        return blog;
    }

    public String getContent()
    {
        return content;
    }

    public UserBlog getUser()
    {
        return user;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public void setContent(final String content)
    {
        this.content = content;
    }
}
