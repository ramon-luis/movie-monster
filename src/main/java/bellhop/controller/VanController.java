package bellhop.controller;

import bellhop.domain.Van;
import bellhop.service.VanService;
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
public class VanController {

    private VanService mVanService;

    @Autowired
    public VanController(VanService vanService) {
        mVanService = vanService;
    }

    // list + CRUD

    // list : get
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("vans", mVanService.list());
        return "vanlist"; // vanlist.html page
    }

    // create : post
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Van create(@RequestBody Van van) {
        return mVanService.create(van);
    }

    // read : get
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Van read(@PathVariable(value = "id") long id) {
        return mVanService.read(id);
    }

    // update : put
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Van update(@PathVariable(value = "id") long id, @RequestBody Van van) {
        return mVanService.update(id, van);
    }

    // delete : delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        mVanService.delete(id);
    }


}
