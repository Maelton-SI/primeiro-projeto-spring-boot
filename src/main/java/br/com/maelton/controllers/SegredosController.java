package br.com.maelton.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segredos")
public class SegredosController {
    
    /**
     * Entrada:
     * ______________________
     * |Key    | Value       |
     * |cpf    | 09955419931 |
     * |idade  | 21          |
     * _______________________
     * 
     * Saída:
     * 09955419931: 21
     */
    @PostMapping("/idade")
    public String idade(@RequestHeader String cpf, @RequestHeader String idade) {
        return cpf + ": " + idade;
    }

    /**
     * Entrada:
     * ___________________________
     * |Key    | Value            |
     * |logradouro | rua sem volta|
     * |bairro     | sem saida    |
     * |cidade     | sem rota     |
     * |estado     | sem recomeco |
     * |cep        | 00000000     |
     * ____________________________
     * 
     * Saída:
     * 
     * [logradouro=rua sem volta, bairro=sem saida, cidade=sem rota, estado=sem *recomeco, cep=00000000, user-agent=PostmanRuntime/7.35.0, accept=/, postman-token=e25e744e-1cd8-4b5a-a842-fd71da663a49, host=localhost:8080, accept-encoding=gzip, deflate, br, connection=keep-alive, content-length=0]
     *
     */
    @PostMapping("/endereco")
    public String endereco(@RequestHeader Map<String, String> endereco) {
        return "" + endereco.entrySet();
    }
}
