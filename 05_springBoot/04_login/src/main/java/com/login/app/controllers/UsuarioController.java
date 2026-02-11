package com.login.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.login.app.models.Usuario;
import com.login.app.repositories.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "usuarios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Usuario usuario = repository.findById(id).orElseThrow();
        model.addAttribute("usuario", usuario);
        return "editar";
    }

    @PostMapping("/editar")
    public String salvar(@ModelAttribute Usuario usuario) {
        repository.save(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/usuarios";
    }
}
