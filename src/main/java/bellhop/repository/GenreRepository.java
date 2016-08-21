package bellhop.repository;

import bellhop.domain.Genre;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by RAM0N on 8/16/16.
 */
public interface GenreRepository extends CrudRepository<Genre, Long> {

}
