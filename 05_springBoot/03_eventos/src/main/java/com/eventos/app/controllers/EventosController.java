package com.eventos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.app.models.Evento;
import com.eventos.app.repository.EventosRepository;

@Controller

// Pode ser usado o metodo GetMapping ou RequestMapping
public class EventosController {
    @Autowired

    // Pega os dados do sistemas(Evento) e manipula no banco, Responsavel pelo CRUD
    private EventosRepository csr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = csr.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }

    // Reconhecer os dados da pasta de cadastro e enviar
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String cadastrarEvento() {
        return "cadastrar-evento";
    }

    // enviar os dados pro banco

    @RequestMapping(value = "cadastrarEvento", method = RequestMethod.POST)
    public String cadastarEvento(Evento evento) {
        csr.save(evento); // Recebe o insert faz o Evento e redireciona
        return "redirect:cadastroSucesso";
    }

    @RequestMapping("/cadastroSucesso")
    public String cadastroSucesso() {
        return "cadastro-sucesso";
    }

}
