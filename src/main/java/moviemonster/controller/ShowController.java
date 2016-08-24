package moviemonster.controller;

import moviemonster.domain.Show;
import moviemonster.service.ShowService;
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
public class ShowController {

    private ShowService mShowService;

    @Autowired
    public ShowController(ShowService showService) {
        mShowService = showService;
    }

    // list + CRUD

    // list : get
    @RequestMapping(value = "/shows", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("shows", mShowService.list());
        return "shows"; // shows.html page
    }

    // form : new/update
    @RequestMapping(value = "show/new")
    public String newShow(Model model) {
        model.addAttribute("show", new Show());
        return "form";
    }

    // create : post
    @RequestMapping(value= "show", method = RequestMethod.POST)
    public String saveShow(Show show) {
        mShowService.create(show);
        return "redirect:/show/" + show.getId();
    }

    // read : get
    @RequestMapping(value = "show/{id}")
    public String viewShow(@PathVariable long id, Model model) {
        model.addAttribute("show", mShowService.read(id));
        return "show";
    }

    // update : put
    @RequestMapping(value = "show/edit/{id}")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("show", mShowService.read(id));
        return "form";
    }

    // delete : delete
    @RequestMapping(value = "show/delete/{id}")
    public String delete(@PathVariable long id) {
        mShowService.delete(id);
        return "redirect:/shows";
    }


}
