package com.stefanini.heroi.bo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.stefanini.heroi.dto.Duelo;
import com.stefanini.heroi.dto.PersonagemDto;
import com.stefanini.heroi.enume.Atributos;
import com.stefanini.heroi.util.BancoMemoriaUtil;

public class DueloBO {

	public Duelo createDuelo(PersonagemDto personagemVitorioso) throws IOException {
		List<PersonagemDto> listPersonagem = BancoMemoriaUtil.getInstance().carregaPersonagens();
		Random random = new Random();
		int numAleatorio = random.nextInt(listPersonagem.size());
		PersonagemDto p1 = (personagemVitorioso == null) ? listPersonagem.get(numAleatorio) : personagemVitorioso;
		listPersonagem.remove(numAleatorio);
		numAleatorio = random.nextInt(listPersonagem.size());
		PersonagemDto p2 = listPersonagem.get(numAleatorio);
		while (p1.getAlinhamento().equals(p2.getAlinhamento())) {
			numAleatorio = random.nextInt(listPersonagem.size());
			p2 = listPersonagem.get(numAleatorio);
		} if (!p1.equals(p2)) {
			Duelo duelo = new Duelo(Arrays.asList(p1, p2));
			boolean duelando = true;
			while (duelando) {
				int randomAtributo = random.nextInt(6) + 1;
				if (randomAtributo == Atributos.inteligencia.getCod()) {
					duelo = dueloAtributoInteligenciaEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				} else if (randomAtributo == Atributos.forca.getCod()) {
					duelo = dueloAtributoForcaEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				} else if (randomAtributo == Atributos.destreza.getCod()) {
					duelo = dueloAtributoDestrezaEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				} else if (randomAtributo == Atributos.poder.getCod()) {
					duelo = dueloAtributoPoderEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				} else if (randomAtributo == Atributos.combate.getCod()) {
					duelo = dueloAtributoCombateEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				} else if (randomAtributo == Atributos.defesa.getCod()) {
					duelo = dueloAtributoDefesaEscolherVitorioso(p1, p2, duelo);
					duelando=(duelo.getPersonagemVitorioso()!=null) ? false : true;
				}
			}
			return duelo;
		}else 
			while(p1.equals(p2)) {
				numAleatorio = random.nextInt(listPersonagem.size());
				p2 = listPersonagem.get(numAleatorio);
			}
		return createDuelo(p1);
		
	}
	private Duelo dueloAtributoInteligenciaEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getInteligencia() > p2.getInteligencia()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setInteligencia(p1.getInteligencia()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setInteligencia(p2.getInteligencia()-2);
			duelo.setAtributo(Atributos.inteligencia);
		} else if (p1.getInteligencia() < p2.getInteligencia()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setInteligencia(p2.getInteligencia()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setInteligencia(p1.getInteligencia()-2);
			duelo.setAtributo(Atributos.inteligencia);
		}
		return duelo;
	}
	private Duelo dueloAtributoPoderEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getPoder() > p2.getPoder()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setPoder(p1.getPoder()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setPoder(p2.getPoder()-2);
			duelo.setAtributo(Atributos.poder);
		} else if (p1.getPoder() < p2.getPoder()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setPoder(p2.getPoder()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setPoder(p1.getPoder()-2);
			duelo.setAtributo(Atributos.poder);
		}
		return duelo;
	}
	private Duelo dueloAtributoCombateEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getCombate() > p2.getCombate()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setCombate(p1.getCombate()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setCombate(p2.getCombate()-2);
			duelo.setAtributo(Atributos.combate);
		} else if (p1.getCombate() < p2.getCombate()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setCombate(p2.getCombate()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setCombate(p1.getCombate()-2);
			duelo.setAtributo(Atributos.combate);
		}
		return duelo;
	}
	private Duelo dueloAtributoForcaEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getForca() > p2.getForca()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setForca(p1.getForca()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setForca(p2.getForca()-2);
			duelo.setAtributo(Atributos.forca);
		} else if (p1.getForca() < p2.getForca()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setForca(p2.getForca()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setForca(p1.getForca()-2);
			duelo.setAtributo(Atributos.forca);
		}
		return duelo;
	}
	private Duelo dueloAtributoDefesaEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getDefesa() > p2.getDefesa()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setDefesa(p1.getDefesa()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setDefesa(p2.getDefesa()-2);
			duelo.setAtributo(Atributos.defesa);
		} else if (p1.getDefesa() < p2.getDefesa()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setDefesa(p2.getDefesa()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setDefesa(p1.getDefesa()-2);
			duelo.setAtributo(Atributos.defesa);
		}
		return duelo;
	}
	private Duelo dueloAtributoDestrezaEscolherVitorioso(PersonagemDto p1, PersonagemDto p2, Duelo duelo) {
		if (p1.getDestreza() > p2.getDestreza()) {
			duelo.setPersonagemVitorioso(p1);
			p1.setDestreza(p1.getDestreza()+2);
			p1.setVitorias(p1.getVitorias()+1);
			p2.setDestreza(p2.getDestreza()-2);
			duelo.setAtributo(Atributos.destreza);
		} else if (p1.getDestreza() < p2.getDestreza()) {
			duelo.setPersonagemVitorioso(p2);
			p2.setDestreza(p2.getDestreza()+2);
			p2.setVitorias(p2.getVitorias()+1);
			p1.setDestreza(p1.getDestreza()-2);
			duelo.setAtributo(Atributos.destreza);
		}
		return duelo;
	}
}
