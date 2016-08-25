package moviemonster.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by RAM0N on 8/16/16.
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

