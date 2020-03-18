package cluedo.seresDivinos;

import java.util.ArrayList;
import java.util.Iterator;

import cluedo.morgue.Morgue;
import cluedo.personas.Asesino;
import cluedo.personas.Objetivo;

public abstract class Dios {
	
	public static void resucitar(Asesino asesino, String dni) {
		ArrayList<Objetivo> listaVictimas = new ArrayList<Objetivo>(); 
		listaVictimas = asesino.getListaVictimasDetencion();
		//https://www.arquitecturajava.com/java-iterator-vs-foreach/
		Iterator<Objetivo> it = listaVictimas.iterator();
		while(it.hasNext()) {
			if(it.next().getDni().equals(dni)) {
				it.remove();
				Morgue.sacarDeMorgue(dni);
			}
		}
	}
}
