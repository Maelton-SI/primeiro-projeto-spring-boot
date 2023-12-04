package br.com.maelton.components;

import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {
    
    public String hello() {
        return "Hey there, I'm a component.";
    }
}
