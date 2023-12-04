package br.com.maelton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maelton.components.MyFirstComponent;

@RestController
@RequestMapping("/componentUser")
public class ComponentUser {
    
    //Não precisarei instanciar, o spring boot irá gerenciar pra mim
    @Autowired
    MyFirstComponent primeiroComponente;

    @GetMapping("/firstComponent")
    public String firstComponent() {
        return primeiroComponente.hello();
    }
}
