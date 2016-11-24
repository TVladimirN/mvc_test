package ru.server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SuppressWarnings("UnusedDeclaration")
public class IndexController {

    @Value("${example.message}")
    private String message;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "Hello!";
    }

    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннотации и настройки пути после деплоя) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("home");
        return modelAndView;
    }

}