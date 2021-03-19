package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/Helyeah")
    public String greeting(@RequestParam(name="thisName", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "Hellopage";
    }

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("mainPageAttribute", "I would like to play a game with YOU!");
        return "mainPage";
    }
}

