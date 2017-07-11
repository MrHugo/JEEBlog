package beans;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Comment
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private UserBlog user;
    @ManyToOne
    private Article article;

    public Integer getId() {
        return id;
    }

    public UserBlog getUser() {
        return user;
    }

    public void setUser(final UserBlog user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(final Article article) {
        this.article = article;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    @Column
    private String content;

}
