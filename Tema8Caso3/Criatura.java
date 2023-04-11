package Tema8Caso3;

public abstract class Criatura {

	// atributos de la clase abstracta
	private int vidaMaxima;
	private int vidaActual;
	private int fuerza;
	private int resistencia;
	private String nombre;
	private boolean muerto;

	// Constructor con todos los parametros que sean obligatorios
	public Criatura(int vidaMaxima, String nombre, int fuerza, int resistencia) {
		super();
		this.vidaMaxima = vidaMaxima;
		this.vidaActual = vidaMaxima;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.nombre = nombre;
		this.muerto = false;
	}

	// metodos getter y setter
	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaMaxima;
	}

	public int getFuerza() {
		return fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMuerto() {
		return muerto;
	}

	public int getResistencia() {
		return resistencia;
	}

	// metodo lucha
	public void luchar(Criatura c) {
		if (this.muerto)
			System.out.println(this.nombre + " no puede atacar porque está muerto.");
		if (c.muerto)
			System.out.println(this.nombre + " no se le puede atacar, ya esta muerto.");

		int damage = this.fuerza - c.resistencia;
		c.recibirDamage(damage);
		System.out.println(this.nombre + " ataca a " + c.nombre + " y le hace " + damage + " puntos de daño.");
		System.out.println("La vida total de " + this.nombre + " es de " + this.vidaActual);
	}

	// metodo donde se calcula el daño
	public void recibirDamage(int damage) {
		this.vidaActual -= damage;
		if (this.vidaActual <= 0) {
			this.muerto = true;
			System.out.println(this.nombre + " ha muerto.");
		}
	}

	// metodo para recuperar vida de forma aleatoria
	public void recuperar() {
		int vidaRecuperada = (int) (this.vidaActual + Math.random() * (this.vidaMaxima - this.vidaActual));
		this.vidaActual = this.vidaActual + vidaRecuperada;
		System.out.println(this.nombre + " ha recuperado " + vidaRecuperada + " puntos de vida.");
		if(this.vidaActual>0)this.muerto=false;
	}

	// metodo para recuperar toda la vida de golpe
	public void descansar() {
		vidaActual = vidaMaxima;
		System.out.println(this.nombre + " ha recuperado toda la vida.");
		if(this.vidaActual>0)this.muerto=false;
	}

}
