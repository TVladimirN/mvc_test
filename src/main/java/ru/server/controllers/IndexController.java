package ru.server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.test.Test;

@Controller
@SuppressWarnings("UnusedDeclaration")
@RequestMapping("/")
public class IndexController {

    @Value("${example.message}")
    private String message;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return message;
    }


    @RequestMapping(value = "/t", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {
        model.addAttribute("message", new Test().getRandom());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(ModelMap model) {
//        model.addAttribute("message", new Test().getRandom());
        return "home";
    }

    @RequestMapping(value = "/tt", method = RequestMethod.GET)
    public String loadStudentsJsp(Model model) {
        model.addAttribute("index", "restadasdfdgrr");
        return "index";
    }
}