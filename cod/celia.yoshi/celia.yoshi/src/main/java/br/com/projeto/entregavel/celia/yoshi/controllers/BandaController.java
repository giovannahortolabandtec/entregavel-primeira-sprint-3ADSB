package br.com.projeto.entregavel.celia.yoshi.controllers;

import br.com.projeto.entregavel.celia.yoshi.models.Banda;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bandas")
public class BandaController {

        List<Banda> banda = new ArrayList<Banda>();

        @GetMapping("/visualizar/lista")
        public ResponseEntity getBandas() {
            if(banda.isEmpty()){
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.ok().body(banda);
            }
        }

        @GetMapping("/recuperar/{id}")
        public ResponseEntity getBanda(@PathVariable int id) {
            if (banda.size() >= id) {
                return ResponseEntity.ok()
                        .body(banda.get(id - 1));
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PostMapping("/cadastrar")
        public ResponseEntity cadastrarBanda(@RequestBody Banda nova) {
            banda.add(nova);
            return ResponseEntity.status(201).build();
        }

        @DeleteMapping("/deletar/{id}")
        public ResponseEntity excluirBanda(@PathVariable int id) {
            if(banda.size() >= id) {
                banda.remove(id-1);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PutMapping("/alterar/{id}")
        public ResponseEntity alterarCantor(@PathVariable int id, @RequestBody Banda bandas) {
            if(banda.size() >= id) {
                banda.set(id-1, bandas);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.noContent().build();
            }
        }

        @GetMapping("/consultar/valor/{id}")
        public ResponseEntity getCalculaShow(@PathVariable int id) {
            return ResponseEntity.ok().body(banda.get(id-1).getCalculaShow());
        }
}
