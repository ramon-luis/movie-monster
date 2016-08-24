package moviemonster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RAM0N on 8/21/16.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }
}
