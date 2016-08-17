package bellhop.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class Van {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    private Make make;



    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    private String imgurl;
    private String name;

    public Van(Make make, String name, String description, String imgurl) {
        this.description = description;
        this.make = make;
        this.name = name;
        this.imgurl = imgurl;
        createTime = new Date();
    }

    public Van() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Van{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", make=" + make +
                ", createTime=" + createTime +
                ", imgurl='" + imgurl + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
