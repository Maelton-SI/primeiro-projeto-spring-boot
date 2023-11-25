package br.com.maelton.primeiroprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.maelton.controllers.ConselhosController;

//Classe de inicializacao gerenciada pelo Spring Boot
@SpringBootApplication
//Pesquisa por componentes em todo o pacote da classe especificada
@ComponentScan(basePackageClasses = ConselhosController.class)
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}
}