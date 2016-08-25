package moviemonster.controller;

import moviemonster.domain.Movie;
import moviemonster.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by RAM0N on 8/24/16.
 */

@RestController
@RequestMapping("/api")
public class ApiController {

    private MovieService movieService;

    @Autowired
    public ApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    // list all
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public Iterable<Movie> list() {
        return movieService.list();
    }

    // read
    @RequestMapping(value = "movie/{id}")
    public Movie viewMovie(@PathVariable long id) {
        return movieService.read(id);
    }

    // delete
    @RequestMapping(value = "movie/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        Movie deletedMovie = movieService.read(id);
        movieService.delete(id);
        return "movie " + id + " deleted successfully\n\n" + deletedMovie;
    }

    // create and update
    @RequestMapping(value= "movie", method = RequestMethod.POST)
    public String createMovie(@RequestBody Movie jsonString) {
        Movie updatedMovie = movieService.create(jsonString);
        return "movie successfully added/updated\n\n" + updatedMovie;
    }

}
