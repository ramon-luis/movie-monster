package moviemonster.repositories;

import moviemonster.domain.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by RAM0N on 8/16/16.
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
