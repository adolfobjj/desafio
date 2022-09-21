package br.com.desafio.internal.controller;

import br.com.desafio.internal.domain.Usuario;
import br.com.desafio.internal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @PutMapping(value = "/{id}")
    public  ResponseEntity<Usuario> update(@PathVariable Integer id,@RequestBody Usuario obj){
        Usuario newObj = service.update(id,obj);
        return  ResponseEntity.ok().body(newObj);



    }


}
