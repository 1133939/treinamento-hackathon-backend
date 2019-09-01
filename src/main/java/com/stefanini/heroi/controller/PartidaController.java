package com.stefanini.heroi.controller;

import java.io.IOException;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.heroi.bo.PartidaBO;
import com.stefanini.heroi.dto.Partida;

/**
 * Classe adicionar face
 * @author c1297467
 *
 */

@RestController
@CrossOrigin
@RequestMapping(value="/partida")
public class PartidaController {

	private PartidaBO partidaBO = new PartidaBO();

	
	@RequestMapping(path = "/jogadas",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Partida createJogada(@RequestBody Partida partida) {
		try {
			return partidaBO.createJogada(partida);
		} catch (IOException e) {
			e.printStackTrace();
			return partida;
		}
	}
	
}