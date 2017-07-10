package beans;

import javax.persistence.Entity;
import com.sun.istack.internal.NotNull;
import javax.persistence.*;

@Entity
public class Comment
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull @ManyToOne
    private UserBlog user;
    private Integer article_id;
    private String content;

}
