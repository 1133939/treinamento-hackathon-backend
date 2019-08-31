package com.stefanini.heroi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.heroi.bo.DueloBO;
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
@RequestMapping(value="/duelo")
public class DueloController {

	private DueloBO dueloBO = new DueloBO();
	
	
	@RequestMapping(method=RequestMethod.GET)
	public Duelo createDuelo() throws IOException {
		return dueloBO.createDuelo(null);
	}

	
}