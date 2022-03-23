package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosSemana")
public class objetivosSemanalController {

	@GetMapping
	public String objetivosSemana() {
		return "Objetivos da semana: \nEstudar mais MySQl \nAprender principios básico do Spring"
				+ " \nEntrgar todas atividades no mesmo dia";
}

}