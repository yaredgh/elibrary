package edu.mum.cs425.eregister.eregister.edu.mum.cs425.eregister.ergister.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/eregister","/eregister/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
