package br.com.maelton.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualidades")
public class QualidadesController {
    
    //Requisicao POST com Map
    //Exemplo de rota: localhost:8080/qualidades/psicologica
    /** Exemplo de uso:
     *
     *  {
     *      "nome": "Felpa",
     *      "psicologico": "confiante, inteligente e bem-humorada"
     *  }
     * 
     *  Saída:
     *  Felpa é confiante, inteligente e bem-humorada.
     */
    @PostMapping("/psicologica")
    public String qualidadePsicologica(@RequestBody Map<String, String> pessoa) {
        return pessoa.get("nome") + " é " + pessoa.get("psicologico") + ".";
    }

    //Requisicao POST com String
    //Exemplo de rota: localhost:8080/qualidades/fisicas
    /** Exemplo de uso:
     *  {
     *     "nome": "Felpa",
     *     "idade": "21",
     *     "tamanho": "alta",
     *     "forca": "normal",
     *     "flexibilidade": "ótima",
     *     "resistencia": "acima da média"
     *  }
     * 
     *   Saída:
     *  {
     *     "nome": "Felpa",
     *     "idade": "21",
     *     "tamanho": "alta",
     *     "forca": "normal",
     *     "flexibilidade": "ótima",
     *     "resistencia": "acima da média"
     *  }  
     */
    @PostMapping("/fisicas")
    public String qualidadesFisicas(@RequestBody String pessoa) {
        return pessoa;
    }

}
