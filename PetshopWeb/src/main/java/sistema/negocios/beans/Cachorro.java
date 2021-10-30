package sistema.negocios.beans;

import sistema.negocios.beans.enums.EnumRacaCachorro;
import sistema.negocios.beans.enums.EnumSexo;

public class Cachorro extends Animal{
	
	private EnumRacaCachorro raca;
	
	public Cachorro(String id, int idade, EnumSexo sexo, String nome, String emailDono, String descricao, EnumRacaCachorro raca) {
		super(id, idade, sexo, nome, emailDono, descricao);
		this.raca = raca;
	}

	public EnumRacaCachorro getRaca() {
		return raca;
	}

	public void setRaca(EnumRacaCachorro raca) {
		this.raca = raca;
	}

	
}
