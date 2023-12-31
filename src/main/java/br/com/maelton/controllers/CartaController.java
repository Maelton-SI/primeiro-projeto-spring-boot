package br.com.maelton.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class CartaController {

    //Retornando objeto ResponseEntity utilizando GET
    @GetMapping("/casamento/{resposta}")
    public ResponseEntity<Object> querCasarComigo(@PathVariable String resposta) {
        if (resposta.equals("Sim")) 
            return ResponseEntity.status(HttpStatus.OK).body("Claro!");
        else 
            return ResponseEntity.badRequest().body("Não, sinto muito!");
    }
}
