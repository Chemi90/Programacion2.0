package tema9Caso2;

public class Mundo {

	private String nombre;
	private float diametro;
	private boolean habitable;

	// contructor con valores predefinidos
	public Mundo() {
		super();
		this.nombre = "";
		this.diametro = 0;
		this.habitable = false;
	}

	// constructor donde se introduciran el valor de todos los atributos mediante
	// variables
	public Mundo(String n, float d, boolean h) {
		super();
		this.nombre = n;
		this.diametro = d;
		this.habitable = h;
	}

	//metodos de modificacion y consulta de cada atributo
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	public boolean isHabitable() {
		return habitable;
	}

	public void setHabitable(boolean habitable) {
		this.habitable = habitable;
	}

	@Override
	public String toString() {
		return "Mundo [nombre=" + nombre + ", diametro=" + diametro + ", habitable=" + habitable + "]";
	}

	

}
