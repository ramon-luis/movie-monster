package moviemonster.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Genre object has a single member (String name) with a many-to-one relationship with Movies.
 */

@Entity
public class Genre {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Genre(){}

    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id  = id;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                '}';
    }
}

