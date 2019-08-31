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
@RequestMapping(value="/herois")
public class HeroisController {

//	private PersonagemBO personagemBo = new PersonagemBO();
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public List<PersonagemDto> carregaHeroi() throws IOException {
//		return personagemBo.carregarPersonagem();
//	}
//	
//	@RequestMapping(method=RequestMethod.GET,value = "/duelo")
//	public Duelo createDuelo() throws IOException {
//		return personagemBo.createDuelo(null);
//	}
//	@RequestMapping(method=RequestMethod.GET,value = "/partida")
//	public Partida createJogada() throws IOException {
//		return personagemBo.createJogada(null);
//	}
//	
//	@RequestMapping(path = "/jogadas",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
//	public Partida createJogada(@RequestBody Partida partida) {
//		try {
//			return personagemBo.createJogada(partida);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return partida;
//		}
//	}
//	@RequestMapping(path = "/mutante",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
//	public PersonagemDto createMutante(@RequestBody Partida partida) {
//		PersonagemDto mutante = new PersonagemDto();
//		return mutante = personagemBo.createHeroiMutante(partida);
//	}
	
}