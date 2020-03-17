package cluedo.actuacionesPoliciales;

import cluedo.personas.Asesino;
import cluedo.personas.Policia;

public class Investigacion {

	private int numExpediente;
	private Policia policia;
	private Asesino asesino;
	
	public Investigacion(Policia policia, Asesino asesino, int numExpediente) {
		this.policia = policia;
		this.asesino = asesino;
		this.numExpediente = numExpediente;
		iniciarInvestigacion();
	}
	
	public void iniciarInvestigacion() {
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		//TODO: cambiar el orden de los if para hacerlo de una manera más optimizada
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		if(this.policia.getHabilidad() >= this.asesino.getEfectividad()) {
			if(this.asesino.getListaVictimasDetencion().isEmpty()) {
				System.out.println("La investigación " + this.numExpediente + " ha concluido. " + this.asesino.getNombre() 
				+ " es inocente.");
			} else {
				this.policia.detenerAsesino(this.asesino);
			}
		}else {
			System.out.println("Comisario, soy el policía: " + this.policia.getNombre() + " con placa: " + this.policia.getPlacaIdentificacion()
			+ " le informamos de que el caso " + this.numExpediente + " ha quedado sin resolver.");
		}
	}
}
