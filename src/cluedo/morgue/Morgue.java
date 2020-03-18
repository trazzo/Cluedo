package cluedo.morgue;

import java.util.ArrayList;
import java.util.Iterator;

import cluedo.personas.Objetivo;

public abstract class Morgue {
	
	private static ArrayList<Objetivo> frigorifico = new ArrayList<Objetivo>();

	public static void sacarDeMorgue(String dni) {
		Iterator<Objetivo> it = frigorifico.iterator();
		while(it.hasNext()) {
			if(it.next().getDni().equals(dni)) {
				it.remove();
			}
		}
	}
	
	public static ArrayList<Objetivo> getFrigorifico() {
		return frigorifico;
	}

	public static void setFrigorifico(ArrayList<Objetivo> frigorifico) {
		Morgue.frigorifico = frigorifico;
	}
	
	public static void verContenidoFrigorifico() {
		for (Objetivo victima : frigorifico) {
			System.out.println(victima.toString());
		}
	}
	
	/*
	 * ¿cuándo se va a llenar? -> cada vez que maten a un Objetivo
	 * ¿nos importa quién mató al Objetivo? -> NO 
	 * */
	
}
