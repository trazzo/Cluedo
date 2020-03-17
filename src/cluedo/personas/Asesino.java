package cluedo.personas;

import java.util.ArrayList;

public class Asesino extends Persona {
	
	private int efectividad;
	private String modus;
	private ArrayList<Objetivo> listaVictimas; 
	
	public Asesino(String nombre, String dni, int edad, int efectividad, String modus) {
		super(nombre,dni,edad);
		this.efectividad = efectividad;
		this.modus = modus;
		this.listaVictimas = new ArrayList<Objetivo>();
	}

	public String matar(Objetivo objetivo) {
		if(objetivo.isEstaVivo() == false) {
			return "El objetivo" + objetivo.getNombre() 
					+ "está muerto, no te sobres";
		}else {
			objetivo.setEstaVivo(false);
			this.listaVictimas.add(objetivo);
			return "El objetivo " + objetivo.getNombre() 
					+ " ha sido asesinado por " + this.getNombre();
		}
	}
	
	public int getEfectividad() {
		return efectividad;
	}

	public void setEfectividad(int efectividad) {
		this.efectividad = efectividad;
	}

	public String getModus() {
		return modus;
	}

	public void setModus(String modus) {
		this.modus = modus;
	}
	
	public void getListaVictimas() {
		int i = 1;
		pintarCabeceraLista();
		for(Objetivo victima : this.listaVictimas) {
			System.out.println("* Victima: " + i + " => " + victima.toString()+ " *");
			i++;
		}
		pintarPieLista();
	}
	
	public ArrayList<Objetivo> getListaVictimasDetencion() {
		return this.listaVictimas;
	}

	public void setListaVictimas(ArrayList<Objetivo> listaVictimas) {
		this.listaVictimas = listaVictimas;
	}

	@Override
	public String toString() {
		return "Asesino [efectividad=" + efectividad + ", modus=" + modus + "]";
	}

	private void pintarCabeceraLista() {
		System.out.println("*************LISTA DE VICTIMAS DE: " + this.getNombre().toUpperCase() + "**************");
	}
	
	private void pintarPieLista() {
		System.out.println("***************************************************");
	}
	
	
}
