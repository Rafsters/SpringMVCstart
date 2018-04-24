package mvcSpring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String showPage(){
        System.out.println("Inside showPage");
        return "mainmenu";
    }

    @RequestMapping("/another")
    public String showAnotherPage(){
        System.out.println("inside showAntoherPage");
        return "index";
    }

}
