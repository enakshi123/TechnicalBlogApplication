package TechnicalBlog.model;

import javax.persistence.Entity;
import java.util.Date;
@Entity
public class Post { //pojo class

    private Integer id; //id for every post

    private String title; // title for every post
    private String body; // body for posts
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
