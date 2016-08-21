package bellhop.domain;

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
    private Long mId;

    @ManyToOne
    private MediaType mMediaType;

    private String mName;

    @Column(columnDefinition = "TEXT")
    private String mDescription;

    @ManyToOne
    private Genre mGenre;

    private String mRunningTime;
    private int mRottenTomatoesRating;
    private int mMetaCriticRating;

    private String mImageUrl;


    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date mCreatedTime;

    public Show(MediaType mediaType, String name, String description, Genre genre, String runningTime,
                int rottenTomatoesRating, int metaCriticRating, String imageUrl) {
        mMediaType = mediaType;
        mName = name;
        mDescription = description;
        mGenre = genre;
        mRunningTime = runningTime;
        mRottenTomatoesRating = rottenTomatoesRating;
        mMetaCriticRating = metaCriticRating;
        mImageUrl = imageUrl;
        mCreatedTime = new Date();
    }

    public Show() {
        mCreatedTime = new Date();
    }

    public Long getId() {
        return mId;
    }

    public MediaType getMediaType() {
        return mMediaType;
    }

    public void setMediaType(MediaType mediaType) {
        mMediaType = mediaType;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Genre getGenre() {
        return mGenre;
    }

    public void setGenre(Genre genre) {
        mGenre = genre;
    }

    public String getRunningTime() {
        return mRunningTime;
    }

    public void setRunningTime(String runningTime) {
        mRunningTime = runningTime;
    }

    public int getRottenTomatoesRating() {
        return mRottenTomatoesRating;
    }

    public void setRottenTomatoesRating(int rottenTomatoesRating) {
        mRottenTomatoesRating = rottenTomatoesRating;
    }

    public int getMetaCriticRating() {
        return mMetaCriticRating;
    }

    public void setMetaCriticRating(int metaCriticRating) {
        mMetaCriticRating = metaCriticRating;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public Date getCreatedTime() {
        return mCreatedTime;
    }

    @Override
    public String toString() {
        return "Show{" +
                "mId=" + mId +
                ", MediaType=" + mMediaType +
                ", Name='" + mName + '\'' +
                ", Description='" + mDescription + '\'' +
                ", Genre=" + mGenre +
                ", RunningTime=" + mRunningTime +
                ", RottenTomatoesRating=" + mRottenTomatoesRating +
                ", MetaCriticRating=" + mMetaCriticRating +
                ", ImageUrl='" + mImageUrl + '\'' +
                ", CreatedTime=" + mCreatedTime +
                '}';
    }
}
