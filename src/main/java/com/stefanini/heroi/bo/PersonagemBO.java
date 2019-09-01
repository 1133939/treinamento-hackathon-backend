package com.stefanini.heroi.bo;

import java.io.IOException;

import java.util.List;
import java.util.Random;
import com.stefanini.heroi.dto.Partida;
import com.stefanini.heroi.dto.PersonagemDto;
import com.stefanini.heroi.util.BancoMemoriaUtil;

/**
 * Classe responsável pelos personagens
 * @author paulo
 *
 */

public class PersonagemBO {
	private Random random = new Random();

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
		int numAleatorio = random.nextInt(listPersonagem.size());
		return listPersonagem.get(numAleatorio);
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