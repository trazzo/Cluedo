package cluedo.seresDivinos;

import java.util.ArrayList;

import cluedo.personas.Asesino;
import cluedo.personas.Objetivo;

public abstract class Dios {
	
	public static void resucitar(Asesino asesino, String dni) {
		ArrayList<Objetivo> listaVictimas = new ArrayList<Objetivo>(); 
		listaVictimas = asesino.getListaVictimasDetencion();
		///////////////////////////////////////////////////
		//TODO: CONSEGUIR HACER QUE ESTE MÉTODO "FUNCIONE"/
		///////////////////////////////////////////////////
		//https://www.arquitecturajava.com/java-iterator-vs-foreach/
		for(Objetivo v : listaVictimas) {
			if (v.getDni().equals(dni)) {
				listaVictimas.remove(v);
			}
		}
	}
}
