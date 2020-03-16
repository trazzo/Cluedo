package cluedo.principal;

import cluedo.personas.Asesino;
import cluedo.personas.Objetivo;

public class Principal {

	public static void main(String[] args) {
		Asesino asesino1 = new Asesino("Debén","12345678J",20,90,"Machete");
		
		Objetivo objetivo1 = new Objetivo("Satur","12345678K", 20);
		Objetivo objetivo2 = new Objetivo("Rico","12345678Q", 34);
		
		boolean estadoObjetivo = objetivo1.isEstaVivo();
		asesino1.matar(objetivo1);
		asesino1.matar(objetivo2);
		
		
		asesino1.getListaVictimas();
	}

}
