package moviemonster.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class Show {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private MediaType mediaType;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    private Genre genre;

    private String runningTime;
    private int rtRating;  // rotten tomatoes rating
    private int mcRating;  // metacritic rating

    private String imageURL;


    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    public Show(MediaType mediaType, String name, String description, Genre genre, String runningTime,
                int rottenTomatoesRating, int metaCriticRating, String imageUrl) {
        this.mediaType = mediaType;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.runningTime = runningTime;
        rtRating = rottenTomatoesRating;
        mcRating = metaCriticRating;
        imageURL = imageUrl;
        createdTime = new Date();
    }

    public Show() {
        createdTime = new Date();
    }

    public Long getId() {
        return id;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public int getRtRating() {
        return rtRating;
    }

    public void setRtRating(int rtRating) {
        this.rtRating = rtRating;
    }

    public int getMcRating() {
        return mcRating;
    }

    public void setMcRating(int mcRating) {
        this.mcRating = mcRating;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", MediaType=" + mediaType +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Genre=" + genre +
                ", RunningTime=" + runningTime +
                ", RottenTomatoesRating=" + rtRating +
                ", MetaCriticRating=" + mcRating +
                ", ImageUrl='" + imageURL + '\'' +
                ", CreatedTime=" + createdTime +
                '}';
    }
}
