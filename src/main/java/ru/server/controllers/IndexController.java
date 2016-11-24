package ru.server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SuppressWarnings("UnusedDeclaration")
public class IndexController {

    @Value("${example.message}")
    private String message;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return message;
    }

    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннотации и настройки пути после деплоя) */
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView main() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userJSP", new User());
//        modelAndView.setViewName("home");
//        return modelAndView;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(ModelMap model) {

//        String message = "Hello World, Spring 3.0!";
//        return new ModelAndView("hello", "message", message);
//        ModelAndView model = new ModelAndView("index");
//        model.addObject("message", "!test!");
        model.addAttribute("message", "!test!");
//        return model;
        return "index";
    }
}