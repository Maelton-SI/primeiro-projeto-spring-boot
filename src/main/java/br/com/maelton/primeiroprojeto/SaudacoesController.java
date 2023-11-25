package br.com.maelton.primeiroprojeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe é uma controladora REST
@RestController
//Configura uma rota no servidor
@RequestMapping("saudacoes")
public class SaudacoesController {
    
    //Definindo final do recurso (URL)
    @GetMapping("/bemvindo")
    public String bemvindo() {
        return "Bem vindo à minha primeira requisição, estou muito feliz de ter você aqui!!! ;)";
    }
}