package br.com.maelton.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/despedidas")
public class DespedidasController {

    //Requisitando parametro por parametro
    /** Exemplo de uso: 
     * http://127.0.0.1:8080/despedidas/adeus?nome=Felpa&retorno=true
     * 
     * Saida:
     * Adeus Felpa, e até mais!
     *
    */
    @GetMapping("/adeus")
    public String adeus(@RequestParam String nome, @RequestParam Boolean retorno) {

        return retorno?"Adeus " + nome + ", e até mais!" : "Adeus " + nome + ".";
    }

    //Utilizando Map para requisitar parametros
    /** Exemplo de uso: 
     * http://127.0.0.1:8080/despedidas/saudadeDePessoas?nome=Rayssa&nome2=Janaina
     * 
     * Saida:
     * Rayssa, Janaina, já sinto muita saudade de vocês!
     *
    */
    @GetMapping("/saudadeDePessoas")
    public String saudadeDePessoas(@RequestParam Map<String, String> pessoas) {

        String nomes = "";

        for(String nome : pessoas.values()){ nomes += nome + ", "; }

        return nomes + "já sinto muita saudade de vocês!";
    }
}
