package com.stefanini.heroi.enume;


public enum Atributos {
	inteligencia(1),
	forca(2),
	destreza(3),
	poder(4),
	combate(5),
	defesa(6);
		
	private Integer cod;
		
	private Atributos(Integer cod) {
		this.cod=cod;
	}

	public Integer getCod() {
		return cod;
	}


	public static Atributos toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Atributos at : Atributos.values()) {
			if(cod.equals(at.getCod())) {
				return at;
			}
		}
		throw new IllegalArgumentException("Id inválido	"+ cod);
	}
}
