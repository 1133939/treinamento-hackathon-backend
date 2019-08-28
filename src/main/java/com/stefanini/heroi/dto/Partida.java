package com.stefanini.heroi.dto;

import java.util.ArrayList;
import java.util.List;

public class Partida {
private List<Duelo> duelos= new ArrayList<Duelo>();
private PersonagemDto heroiQueMaisVenceu;
private PersonagemDto segundoHeroiQueMaisVenceu;

public List<Duelo> getDuelos() {
	return duelos;
}

public void setDuelos(List<Duelo> duelos) {
	this.duelos = duelos;
}

public PersonagemDto getHeroiQueMaisVenceu() {
	return heroiQueMaisVenceu;
}

public void setHeroiQueMaisVenceu(PersonagemDto heroiQueMaisVenceu) {
	this.heroiQueMaisVenceu = heroiQueMaisVenceu;
}

public PersonagemDto getSegundoHeroiQueMaisVenceu() {
	return segundoHeroiQueMaisVenceu;
}

public void setSegundoHeroiQueMaisVenceu(PersonagemDto segundoHeroiQueMaisVenceu) {
	this.segundoHeroiQueMaisVenceu = segundoHeroiQueMaisVenceu;
}


}
