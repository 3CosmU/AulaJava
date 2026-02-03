package com.eventos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Pode ser usado o metodo GetMapping
public class EventosController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
