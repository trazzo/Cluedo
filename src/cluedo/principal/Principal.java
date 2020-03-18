package cluedo.principal;

import cluedo.actuacionesPoliciales.Investigacion;
import cluedo.morgue.Morgue;
import cluedo.personas.Asesino;
import cluedo.personas.Objetivo;
import cluedo.personas.Policia;
import cluedo.seresDivinos.Dios;

public class Principal {

	public static void main(String[] args) {
		Asesino asesino1 = new Asesino("Debén","12345678J",20,90,"Machete");
		
		Objetivo objetivo1 = new Objetivo("Satur","12345678K", 20);
		Objetivo objetivo2 = new Objetivo("Rico","12345678Q", 34);
		
		Policia policia1 = new Policia("Raul","12345678J", 20, "Nacional", "1AB2C3", 99);
		
		Asesino asesino2 = new Asesino("Jesus", "12345675D", 36, 80, "Sniper");
		
		asesino1.matar(objetivo1);
		asesino1.matar(objetivo2);
		
		
		Investigacion investigacion1 = new Investigacion(policia1, asesino1, 1);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		//TODO: Crear una clase Morgue que contenga un ArrayList con todas las víctimas de todos los asesinos./
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Dios.resucitar(asesino1, "12345678K");
		
		asesino1.getListaVictimas();
		
		Morgue.verContenidoFrigorifico();
		
		
	
		
		
		
	}

}

