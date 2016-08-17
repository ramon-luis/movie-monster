package bellhop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class Make {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Make(String name) {
        this.name = name;
    }

    public Make() {
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
        this.id = id;
    }

    @Override
    public String toString() {
        return "Make{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
