package br.com.maelton.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elogios")
public class ElogiosController {
    
    //path params se definidos sao de uso obrigatorio
    //Uso: suaURL/suaRota/seuvalor

    //Usamos chaves "{}" para receber path params
    //Usamos o @PathVariable para sinalizar que o parametro é uma path param
    @GetMapping("/idade/{idade}")
    public String idade(@PathVariable String idade) {
        return "Parabéns por ter " + idade + " anos, é sempre bom estar vivo!";
    }

    //Caso os identificadores do path param e do argumento do metodo sejam diferentes, sinalize no @PathVariable
    @GetMapping("/primeiro-nome/{pnome}")
    public String nome(@PathVariable("pnome") String nome) {
        
        if (nome == "")
            return "Tão bonito que você está escondendo né... Esse nome dever ser lindo. ;_)";
        
        else if(nome.length()>0 && nome.length()<=4)
            return "Nossa, tão curtinho e tão bonito, arassou! ;_)";
    
        else if(nome.length()>=5 && nome.length()<=8)
            return "Parabéns pelo seu nome, podem existir mais " + nome + " por ai, mas sua pessoa é única! ;)";

        else if(nome.length()>0 && nome.length()<=4)
            return "Já percebeu que seu nome é grandinho " + nome + ", AMEI! ;_)";
        
        return "Acho que gostei do seu nome! ;)";
    }
}
