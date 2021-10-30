package sistema.negocios.beans.enums;

public enum EnumSexo {

	MACHO("Macho"), FEMEA("Femea");
	
	public String valor;
	
	private EnumSexo(String valor) {
		this.valor = valor;
	}
}
