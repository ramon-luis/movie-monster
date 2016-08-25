package moviemonster.domain;

import javax.persistence.*;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL) // no need to have seperate repo, service, etc for Genre with Cascade.ALL
    private Genre genre;

    private int rtRating;  // rotten tomatoes rating

    private int mcRating;  // metacritic rating

    private String imageURL;

    public Movie(){}

    public Movie(String name, String description, Genre genre, int rottenTomatoesRating, int metaCriticRating,
                 String imageUrl) {
        this.name = name;
        this.description = description;
        this.genre = genre;
        rtRating = rottenTomatoesRating;
        mcRating = metaCriticRating;
        imageURL = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id  = id;
    }

    public Long getVersion(){
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", Genre=" + genre +
                ", RottenTomatoesRating=" + rtRating +
                ", MetaCriticRating=" + mcRating +
                ", ImageUrl='" + imageURL + '\'' +
                '}';
    }
}
