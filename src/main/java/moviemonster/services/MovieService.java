package moviemonster.services;

import moviemonster.domain.Movie;

/**
 * Defines required methods for a MovieService.  Note that update() is not explicitly needed: Spring annotations
 * allow Create() to be used for both create and update.
 */

public interface MovieService {

    // list
    Iterable<Movie> list();

    // CRUD
    Movie create(Movie movie);  // handles both create and update via id/version
    Movie read(Long id);
    void delete(long id);

}
