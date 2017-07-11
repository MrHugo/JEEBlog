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
    private beans.article article;
    @Column
    private String content;

}
