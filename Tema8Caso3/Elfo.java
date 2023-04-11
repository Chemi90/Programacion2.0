package Tema8Caso3;

public class Elfo extends Criatura{

	private static final int VidaMaxima = 20;
	private static final int Fuerza = 7;
	private static final int Resistencia = 3;

	public Elfo(String nombre) {
		super(VidaMaxima, nombre, Fuerza, Resistencia);
	}
}
