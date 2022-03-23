package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmController {
	
	@GetMapping
	public String bsm() {
		return "BSM's Mentalidades: \nOrientação ao futuro \nResponsabilidade pessoal \nMentalidade de crescimento \nPersistencia"
				+ "\nBSM's Habilidades: \nTrabalho em equipe \nAtencao  aos detalhes \nProatividade \nComunicação";
	}
}
