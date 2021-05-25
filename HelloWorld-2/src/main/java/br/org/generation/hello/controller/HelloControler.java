package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController //Annotation que indica que é uma classe controladora.
	public class HelloControler {

		@GetMapping("/hello")
		public String sayHello(){
			
			return"Meus objetivos para essa semana é focar na parte técncica, para aprender o máximo possivel e ajudar meu grupo";

}
	}
