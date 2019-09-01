package com.stefanini.heroi.bo;

import java.io.IOException;

import com.stefanini.heroi.dto.Duelo;
import com.stefanini.heroi.dto.Partida;
import com.stefanini.heroi.dto.PersonagemDto;

public class PartidaBO {
	private DueloBO dueloService = new DueloBO();
	
	// A CADA CHAMADA O ARRAY PARTIDA CRIARÁ UM NOVO DUELO ATÉ ATINGIR 10 DUELOS
	public Partida createJogada(Partida partida) throws IOException {
		Duelo duelo;
		Integer quantidadeMaximaDuelosPorPartida = 10;
		if(partida.getDuelos() == null) {
			partida = new Partida();
			duelo = dueloService.createDuelo(null);
			partida.getDuelos().add(duelo);
		}else {
			if(partida.getDuelos().size()<quantidadeMaximaDuelosPorPartida) {
				duelo = dueloService.createDuelo(partida.getDuelos().get(partida.getDuelos().size()-1).getPersonagemVitorioso());
				partida.getDuelos().add(duelo);
			}
			if(partida.getDuelos().size()==quantidadeMaximaDuelosPorPartida) {
				partida = getVitoriosos(partida);
				
			}
		}
		return partida;
	}
	
	private Partida getVitoriosos(Partida partida) {
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
		return partida;
	}
}
