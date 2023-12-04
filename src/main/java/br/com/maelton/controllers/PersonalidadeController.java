package br.com.maelton.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personalidade")
public class PersonalidadeController {
    
    //Requisicao POST utilizando record
    //Exemplo de rota: localhost:8080/personalidade/openness
    /**
     * {
     *     "name": "Felpa",
     *     "openness": "80%",
     *     "conscientiousness": "50%", 
     *     "extroversion": "50%",
     *     "agreeableness": "50%",
     *     "neuroticism": "30%"
     * }
     * 
     * Saída:
     * 
     * Felpa is 80% open minded.
     */
    @PostMapping("/openness")
    public String abertura(@RequestBody Pessoa pessoa) {
        return pessoa.name + " is " + pessoa.openness + " open minded.";
    }

    record Pessoa(String name, 
                  String openness, 
                  String conscientiousness, 
                  String extroversion,
                  String agreeableness,
                  String neuroticism) {}
}
