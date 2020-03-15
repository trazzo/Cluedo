package cluedo.personas;

public class Objetivo extends Persona {
	
	private boolean estaVivo;

	public Objetivo(String nombre, String dni, int edad) {
		super(nombre, dni, edad);
		this.estaVivo = true;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	@Override
	public String toString() {
		return "Objetivo [nombre=" + this.nombre + ", dni=" + this.dni + ", edad=" + this.edad + ", estaVivo=" + this.estaVivo + "]";
	}
	
	
	

}
