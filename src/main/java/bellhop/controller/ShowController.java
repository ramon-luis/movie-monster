package bellhop.controller;

import bellhop.domain.Show;
import bellhop.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("shows", mShowService.list());
        return "showslist"; // showslist.html page
    }

    // create : post
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Show create(@RequestBody Show show) {
        return mShowService.create(show);
    }

    // read : get
    @RequestMapping(value = "/{mId}", method = RequestMethod.GET)
    public Show read(@PathVariable(value = "mId") long id) {
        return mShowService.read(id);
    }

    // update : put
    @RequestMapping(value = "/{mId}", method = RequestMethod.PUT)
    public Show update(@PathVariable(value = "mId") long id, @RequestBody Show show) {
        return mShowService.update(id, show);
    }

    // delete : delete
    @RequestMapping(value = "/{mId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "mId") long id) {
        mShowService.delete(id);
    }


}
