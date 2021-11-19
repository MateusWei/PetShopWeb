package com.petshopweb.models.enums;

public enum EnumTarefa {
	
	//tarefas
	REMEDIO("Remedio"),
	BANHO("Banho"),
	TOSA("Tosa"),
	COMPRAS("Compras");
	
	public String valor;
	
	private EnumTarefa(String valor) {
		this.valor = valor;
	}
}
