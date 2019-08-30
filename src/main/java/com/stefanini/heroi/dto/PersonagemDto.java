package com.stefanini.heroi.dto;

/**
 * Classe que irá carregar todos os personagens
 * @author paulo
 *
 */
public class PersonagemDto {

	private String nome;
	private String alinhamento;
	private Integer inteligencia;
	private Integer forca;
	private Integer destreza;
	private Integer poder;
	private Integer combate;
	private Integer defesa;
	private Integer vitorias=0;
	
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDefesa() {
		return defesa;
	}
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlinhamento() {
		return alinhamento;
	}
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	public Integer getDestreza() {
		return destreza;
	}
	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}
	public Integer getPoder() {
		return poder;
	}
	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	public Integer getCombate() {
		return combate;
	}
	public void setCombate(Integer combate) {
		this.combate = combate;
	}
	public int hashCodePersonagem() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alinhamento == null) ? 0 : alinhamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	public boolean equalsPersonagem(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonagemDto other = (PersonagemDto) obj;
		if (alinhamento == null) {
			if (other.alinhamento != null)
				return false;
		} else if (!alinhamento.equals(other.alinhamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((combate == null) ? 0 : combate.hashCode());
		result = prime * result + ((defesa == null) ? 0 : defesa.hashCode());
		result = prime * result + ((destreza == null) ? 0 : destreza.hashCode());
		result = prime * result + ((forca == null) ? 0 : forca.hashCode());
		result = prime * result + ((inteligencia == null) ? 0 : inteligencia.hashCode());
		result = prime * result + ((poder == null) ? 0 : poder.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonagemDto other = (PersonagemDto) obj;
		if (combate == null) {
			if (other.combate != null)
				return false;
		} else if (!combate.equals(other.combate))
			return false;
		if (defesa == null) {
			if (other.defesa != null)
				return false;
		} else if (!defesa.equals(other.defesa))
			return false;
		if (destreza == null) {
			if (other.destreza != null)
				return false;
		} else if (!destreza.equals(other.destreza))
			return false;
		if (forca == null) {
			if (other.forca != null)
				return false;
		} else if (!forca.equals(other.forca))
			return false;
		if (inteligencia == null) {
			if (other.inteligencia != null)
				return false;
		} else if (!inteligencia.equals(other.inteligencia))
			return false;
		if (poder == null) {
			if (other.poder != null)
				return false;
		} else if (!poder.equals(other.poder))
			return false;
		return true;
	}
	
}