package br.com.maelton.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conselhos")
public class ConselhosController {
    
    @GetMapping("/saude/basico")
    public String saudeBasico() {
        return "Beba água, pratique exercícios físicos e faça amor constantemente. ;)";
    }

    @GetMapping("/profissao/basico") 
    public String profissaoBasico() {
        return "Se tiver a oportunidade, faça aquilo que ama. Se não tiver, faça como se amasse!";
    }
}
