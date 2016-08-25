package moviemonster.controller;

import moviemonster.domain.Movie;
import moviemonster.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for HTML requests.
 * Basic @Controller annotation where methods return String references to HTML templates.
 */

@Controller
public class HtmlController {

    private MovieService movieService;

    @Autowired
    public HtmlController(MovieService movieService) {
        this.movieService = movieService;
    }

    // index
    @RequestMapping("/")
    String index(){
        return "index";
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

    // update: view form
    @RequestMapping(value = "movie/update/{id}")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("movie", movieService.read(id));
        return "movieform";
    }

    // new: view form
    @RequestMapping(value = "movie/new")
    public String newMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "movieform";
    }

    // create & update: process post request
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

    // error handling
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleMyException() {
        return "error";
    }

}
