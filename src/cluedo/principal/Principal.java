package cluedo.principal;

import cluedo.personas.Asesino;
import cluedo.personas.Objetivo;

public class Principal {

	public static void main(String[] args) {
		Asesino asesino1 = new Asesino("Debén","12345678J",20,90,"Machete");
		
		Objetivo objetivo1 = new Objetivo("Satur","12345678K", 20);
		
		boolean estadoObjetivo = objetivo1.isEstaVivo();
		/*System.out.println("estado del objetivo antes del asesinato: " + estadoObjetivo);
		System.out.println(asesino1.matar(objetivo1));
		estadoObjetivo = objetivo1.isEstaVivo();
		System.out.println("estado del objetivo después del asesinato: " + estadoObjetivo);
		asesino1.getListaVictimas();*/
	}

}
