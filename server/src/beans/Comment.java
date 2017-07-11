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

}
