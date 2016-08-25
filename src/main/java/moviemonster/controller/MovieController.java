package moviemonster.controller;

import moviemonster.domain.Movie;
import moviemonster.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by RAM0N on 8/16/16.
 */

@Controller
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // list all
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("movies", movieService.list());
        return "movies";
    }

    // read
    @RequestMapping(value = "movie/{id}")
    public String viewMovie(@PathVariable long id, Model model) {
        model.addAttribute("movie", movieService.read(id));
        System.out.println(movieService.read(id));
        return "movie";
    }

    // update
    @RequestMapping(value = "movie/update/{id}")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("movie", movieService.read(id));
        return "movieform";
    }

    // new
    @RequestMapping(value = "movie/new")
    public String newMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "movieform";
    }

    // create
    @RequestMapping(value= "movie", method = RequestMethod.POST)
    public String createMovie(Movie movie) {
        System.out.println(movie);
        movieService.create(movie);
        return "redirect:/movie/" + movie.getId();
    }

    // delete
    @RequestMapping(value = "movie/delete/{id}")
    public String delete(@PathVariable long id) {
        movieService.delete(id);
        return "redirect:/movies";
    }

}
