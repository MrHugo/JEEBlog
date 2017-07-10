package beans;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class Article
{
    private Integer id;
    private Integer blog_id;
    private String content;
    private Integer user_id;

    public Article(Integer id, Integer blog_id, String content, Integer user_id)
    {
        this.id = id;
        this.blog_id = blog_id;
        this.content = content;
        this.user_id = user_id;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getBlogId()
    {
        return blog_id;
    }

    public String getContent()
    {
        return content;
    }

    public Integer getUserId()
    {
        return user_id;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}
