package sistema.negocios.beans;

import sistema.negocios.beans.enums.EnumRacaGato;
import sistema.negocios.beans.enums.EnumSexo;

public class Gato extends Animal{

	private EnumRacaGato raca;
	
	public Gato(String id, int idade, EnumSexo sexo, String nome, String emailDono, String descricao, EnumRacaGato raca) {
		super(id, idade, sexo, nome, emailDono, descricao);
		this.raca = raca;
	}

	public EnumRacaGato getRaca() {
		return raca;
	}

	public void setRaca(EnumRacaGato raca) {
		this.raca = raca;
	}

	
	
}
