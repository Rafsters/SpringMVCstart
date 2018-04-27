package mvcSpring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SillyController {

    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "silly";
    }

}
