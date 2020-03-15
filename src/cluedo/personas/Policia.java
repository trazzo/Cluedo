package cluedo.personas;

public class Policia extends Persona {
	
	private String cuerpo;
	private String placaIdentificacion;
	private int habilidad;
	
	public Policia(String nombre, String dni, int edad, String cuerpo, String placaIdentificacion, int habilidad) {
		super(nombre, dni, edad);
		this.cuerpo = cuerpo;
		this.placaIdentificacion = placaIdentificacion;
		this.habilidad = habilidad;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getPlacaIdentificacion() {
		return placaIdentificacion;
	}

	public void setPlacaIdentificacion(String placaIdentificacion) {
		this.placaIdentificacion = placaIdentificacion;
	}

	public int getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public String toString() {
		return "Policia [cuerpo=" + cuerpo + ", placaIdentificacion=" + placaIdentificacion + ", habilidad=" + habilidad
				+ "]";
	}
	
	
	
	
	
	
}
