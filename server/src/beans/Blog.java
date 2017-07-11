package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "blog")
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
}
