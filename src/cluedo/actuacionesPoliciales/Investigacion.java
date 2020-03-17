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
		if(this.policia.getHabilidad() >= this.asesino.getEfectividad()) {
			//TODO: comprobar si el asesino es culpable
			this.policia.detenerAsesino(this.asesino);
			//TODO: comprobar qué ocurre si el policía tiene menos habilidad que efectividad tiene el asesino
		}
	}
}
