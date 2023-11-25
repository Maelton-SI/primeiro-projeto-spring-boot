package br.com.maelton.primeiroprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Classe de inicializacao gerenciada pelo Spring Boot
@SpringBootApplication
//Determina o pacote em que os componentes devem ser pesquisados pelo Spring Boot
@ComponentScan(basePackages="package br.com.maelton")
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}
}