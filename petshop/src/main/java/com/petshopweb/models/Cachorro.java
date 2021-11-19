package com.petshopweb.models;

import com.petshopweb.models.enums.EnumRacaCachorro;
import com.petshopweb.models.enums.EnumSexo;
import com.petshopweb.models.enums.EnumTarefa;

public class Cachorro extends Animal {

	private EnumRacaCachorro raca;

	public Cachorro(String id, int idade, EnumSexo sexo, String nome, String email, EnumRacaCachorro raca, String descricao, EnumTarefa tarefa) {
		super(id, idade, sexo, nome, email, descricao, tarefa);
		this.raca = raca;
	}

	public EnumRacaCachorro getRaca() {
		return raca;
	}

	public void setRaca(EnumRacaCachorro raca) {
		this.raca = raca;
	}

}
