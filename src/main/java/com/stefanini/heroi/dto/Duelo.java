package com.stefanini.heroi.dto;

import java.util.ArrayList;
import java.util.List;

import com.stefanini.heroi.enume.Atributos;

public class Duelo {
private List<PersonagemDto> personagens = new ArrayList<PersonagemDto>();
private PersonagemDto personagemVitorioso;
private Integer atributo;
private Partida partida;
public Duelo(List<PersonagemDto> personagens) {
	this.personagens = personagens;
}
public Duelo() {
	
}
public Atributos getAtributo() {
	return Atributos.toEnum(atributo);
}
public void setAtributo(Atributos atributo) {
	this.atributo = atributo.getCod();
}
public List<PersonagemDto> getPersonagens() {
	return personagens;
}
public void setPersonagens(List<PersonagemDto> personagens) {
	this.personagens = personagens;
}
public PersonagemDto getPersonagemVitorioso() {
	return personagemVitorioso;
}
public void setPersonagemVitorioso(PersonagemDto personagemVitorioso) {
	this.personagemVitorioso = personagemVitorioso;
}
public Partida getPartida() {
	return partida;
}
public void setPartida(Partida partida) {
	this.partida = partida;
}


}
