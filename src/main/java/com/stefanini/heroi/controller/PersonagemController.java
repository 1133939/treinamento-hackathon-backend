package com.stefanini.heroi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.heroi.bo.PersonagemBO;
import com.stefanini.heroi.dto.Duelo;
import com.stefanini.heroi.dto.Partida;
import com.stefanini.heroi.dto.PersonagemDto;

/**
 * Classe adicionar face
 * @author c1297467
 *
 */

@RestController
@CrossOrigin
@RequestMapping(value="/personagem")
public class PersonagemController {

	private PersonagemBO personagemBo = new PersonagemBO();
	
	@RequestMapping(method=RequestMethod.GET)
	public List<PersonagemDto> carregaHeroi() throws IOException {
		return personagemBo.carregarPersonagem();
	}

	@RequestMapping(path = "/mutante",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public PersonagemDto createMutante(@RequestBody Partida partida) {
		PersonagemDto mutante = new PersonagemDto();
		return mutante = personagemBo.createHeroiMutante(partida);
	}
	
}