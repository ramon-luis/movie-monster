package moviemonster.services;

import moviemonster.domain.Movie;
import moviemonster.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of a MovieService.
 */
@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Iterable<Movie> list() {
        return movieRepository.findAll();
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie read(Long id) {
        return movieRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        movieRepository.delete(id);
    }
}
