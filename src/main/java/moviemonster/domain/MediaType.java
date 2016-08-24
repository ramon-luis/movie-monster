package moviemonster.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class MediaType {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public MediaType(String name) {
        this.name = name;
    }

    public MediaType() {
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

    @Override
    public String toString() {
        return "MediaType{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                '}';
    }
}
