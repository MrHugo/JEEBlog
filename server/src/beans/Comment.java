package beans;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private UserBlog user;
    @ManyToOne
    private Article article;
    @Column
    private String content;

    public Comment(UserBlog user, Article article, String content)
    {
        this.user = user;
        this.article = article;
        this.content = content;
    }

    public Comment() {}

    public Integer getId()
    {
        return id;
    }

    public UserBlog getUser()
    {
        return user;
    }

    public Article getArticle()
    {
        return article;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(final String content)
    {
        this.content = content;
    }
}
