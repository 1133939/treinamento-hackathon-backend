package com.stefanini.heroi.bo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.stefanini.heroi.dto.Duelo;
import com.stefanini.heroi.dto.Partida;
import com.stefanini.heroi.dto.PersonagemDto;
import com.stefanini.heroi.enume.Atributos;
import com.stefanini.heroi.util.BancoMemoriaUtil;

/**
 * Classe responsável pelos personagens
 * @author paulo
 *
 */

public class PersonagemBO {

	/**
	 * Carrega dados dos personagens na memória
	 * @return
	 * @throws IOException
	 */
	public List<PersonagemDto> carregarPersonagem() throws IOException{
		return BancoMemoriaUtil.getInstance().carregaPersonagens();
	}
	public PersonagemDto carregarUmPersonagem() throws IOException{
		List<PersonagemDto> listPersonagem = BancoMemoriaUtil.getInstance().carregaPersonagens();
		Random random = new Random();
		int numAleatorio = random.nextInt(listPersonagem.size());
		return listPersonagem.get(numAleatorio);
	}

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
					if (p1.getInteligencia() > p2.getInteligencia()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setInteligencia(p1.getInteligencia()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setInteligencia(p2.getInteligencia()-2);
						duelo.setAtributo(Atributos.inteligencia);
						duelando=false;
					} else if (p1.getInteligencia() < p2.getInteligencia()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setInteligencia(p2.getInteligencia()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setInteligencia(p1.getInteligencia()-2);
						duelo.setAtributo(Atributos.inteligencia);
						duelando=false;
					}
				} else if (randomAtributo == Atributos.forca.getCod()) {
					if (p1.getForca() > p2.getForca()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setForca(p1.getForca()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setForca(p2.getForca()-2);
						duelo.setAtributo(Atributos.forca);
						duelando=false;
					} else if (p1.getForca() < p2.getForca()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setForca(p2.getForca()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setForca(p1.getForca()-2);
						duelo.setAtributo(Atributos.forca);
						duelando=false;
					}
				} else if (randomAtributo == Atributos.destreza.getCod()) {
					if (p1.getDestreza() > p2.getDestreza()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setDestreza(p1.getDestreza()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setDestreza(p2.getDestreza()-2);
						duelo.setAtributo(Atributos.destreza);
						duelando=false;
					} else if (p1.getDestreza() < p2.getDestreza()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setDestreza(p2.getDestreza()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setDestreza(p1.getDestreza()-2);
						duelo.setAtributo(Atributos.destreza);
						duelando=false;
					}
				} else if (randomAtributo == Atributos.poder.getCod()) {
					if (p1.getPoder() > p2.getPoder()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setPoder(p1.getPoder()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setPoder(p2.getPoder()-2);
						duelo.setAtributo(Atributos.poder);
						duelando=false;
					} else if (p1.getPoder() < p2.getPoder()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setPoder(p2.getPoder()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setPoder(p1.getPoder()-2);
						duelo.setAtributo(Atributos.poder);
						duelando=false;
					}
				} else if (randomAtributo == Atributos.combate.getCod()) {
					if (p1.getCombate() > p2.getCombate()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setCombate(p1.getCombate()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setCombate(p2.getCombate()-2);
						duelo.setAtributo(Atributos.combate);
						duelando=false;
					} else if (p1.getCombate() < p2.getCombate()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setCombate(p2.getCombate()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setCombate(p1.getCombate()-2);
						duelo.setAtributo(Atributos.combate);
						duelando=false;
					}
				} else if (randomAtributo == Atributos.defesa.getCod()) {
					if (p1.getDefesa() > p2.getDefesa()) {
						duelo.setPersonagemVitorioso(p1);
						p1.setDefesa(p1.getDefesa()+2);
						p1.setVitorias(p1.getVitorias()+1);
						p2.setDefesa(p2.getDefesa()-2);
						duelo.setAtributo(Atributos.defesa);
						duelando=false;
					} else if (p1.getDefesa() < p2.getDefesa()) {
						duelo.setPersonagemVitorioso(p2);
						p2.setDefesa(p2.getDefesa()+2);
						p2.setVitorias(p2.getVitorias()+1);
						p1.setDefesa(p1.getDefesa()-2);
						duelo.setAtributo(Atributos.defesa);
						duelando=false;
					}
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
	public Partida createJogada(Partida partida) throws IOException {
		Duelo duelo = new Duelo(null);
		if(partida.getDuelos() == null) {
			partida = new Partida();
			duelo = createDuelo(null);
			partida.getDuelos().add(duelo);
		}else {
			if(partida.getDuelos().size()<10) {
				duelo = createDuelo(partida.getDuelos().get(partida.getDuelos().size()-1).getPersonagemVitorioso());
				partida.getDuelos().add(duelo);
			}
			if(partida.getDuelos().size()==10) {
				PersonagemDto vitorioso1 = new PersonagemDto();
				PersonagemDto vitorioso2 = new PersonagemDto();

				for(Duelo d : partida.getDuelos()) {
					for(PersonagemDto p : d.getPersonagens()) {
						if(p.getVitorias()>vitorioso1.getVitorias()) {
							if(vitorioso2.equalsPersonagem(p)) {	
								vitorioso2=vitorioso1;
								vitorioso1=p;
							}else {
								vitorioso1=p;
							}
						}else
						if(p.getVitorias()>=vitorioso2.getVitorias() && p.getVitorias()<=vitorioso1.getVitorias() && !p.equalsPersonagem(vitorioso1)) {	
							vitorioso2=p;
						}
						

					}
				}
				
				
				partida.setHeroiQueMaisVenceu(vitorioso1);
				partida.setSegundoHeroiQueMaisVenceu(vitorioso2);
				
			}
		}
		return partida;
	}

	public PersonagemDto createHeroiMutante(Partida partida) {
		PersonagemDto mutante = partida.getHeroiQueMaisVenceu();
		PersonagemDto p2 = partida.getSegundoHeroiQueMaisVenceu();
		Integer inteligencia = (mutante.getInteligencia() > p2.getInteligencia()) ? mutante.getInteligencia() : p2.getInteligencia();
		Integer forca = (mutante.getForca() > p2.getForca()) ? mutante.getForca() : p2.getForca();
		Integer destreza = (mutante.getDestreza() > p2.getDestreza()) ? mutante.getDestreza() : p2.getDestreza();
		Integer poder = (mutante.getPoder() > p2.getPoder()) ? mutante.getPoder() : p2.getPoder();
		Integer combate = (mutante.getCombate() > p2.getCombate()) ? mutante.getCombate() : p2.getCombate();
		Integer defesa = (mutante.getDefesa() > p2.getDefesa()) ? mutante.getDefesa() : p2.getDefesa();
		mutante.setNome(partida.getHeroiQueMaisVenceu().getNome());
		mutante.setCombate(combate);
		mutante.setDefesa(defesa);
		mutante.setDestreza(destreza);
		mutante.setForca(forca);
		mutante.setInteligencia(inteligencia);
		mutante.setPoder(poder);
		return mutante;
	}

}