package br.com.desafio.internal.controller;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findBYId(@PathVariable Integer id){
        Usuario obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
