package beans;

/**
 * Created by Valentin Barat on 10/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class Comment
{
    private Integer id;
    private Integer user_id;
    private Integer article_id;
    private String content;

    public Comment(Integer id, Integer user_id, Integer article_id, String content)
    {
        this.id = id;
        this.user_id = user_id;
        this.article_id = article_id;
        this.content = content;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getUserId()
    {
        return user_id;
    }

    public Integer getArticleId()
    {
        return article_id;
    }

    public String getContent()
    {
        return content;
    }


    public void setContent(String content)
    {
        this.content = content;
    }
}
