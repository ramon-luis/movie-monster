package moviemonster.services;

import moviemonster.domain.Movie;

/**
 * Created by RAM0N on 8/16/16.
 */

public interface MovieService {

    // list
    Iterable<Movie> list();

    // CRUD less update -> update not explicitly needed
    Movie create(Movie movie);
    Movie read(Long id);
    void delete(long id);

}
