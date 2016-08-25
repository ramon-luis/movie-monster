package moviemonster.repositories;

import moviemonster.domain.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * interface to create CRUD repo for Movie objects
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
