package br.com.projeto.entregavel.celia.yoshi.controllers;

import br.com.projeto.entregavel.celia.yoshi.models.Cantor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cantores")
public class CantorController {

    private List<Cantor> cantor = new ArrayList<Cantor>();


    @GetMapping("/lista")
    public ResponseEntity getMusicas() {
        if (cantor.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok()
                    .body(cantor);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity getCantor(@PathVariable int id) {
        if (cantor.size() >= id) {
            return ResponseEntity.ok()
                    .body(cantor.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarCantor(@RequestBody Cantor novo) {
        cantor.add(novo);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity excluirCantor(@PathVariable int id) {
        if(cantor.size() >= id) {
            cantor.remove(id-1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity alterarCantor(@PathVariable int id, @RequestBody Cantor cantores) {
        if(cantor.size() >= id) {
            cantor.set(id-1, cantores);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/consultar/valor/{id}")
    public ResponseEntity getCalculaShow(@PathVariable int id) {
        return ResponseEntity.ok().body(cantor.get(id - 1).getCalculaShow());
    }
}
