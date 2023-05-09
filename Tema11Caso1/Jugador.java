package Tema11Caso1;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{

	private String nombre;
	private int puntos;
	
	public Jugador(String nombre, int puntos) {
		super();
		if (puntos < 0) {
	        throw new IllegalArgumentException("La puntuación no puede ser negativa.");
	    }
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre) && puntos == other.puntos;
	}
	
	@Override
	public int compareTo(Jugador otroJugador) {
	    if (this.puntos != otroJugador.puntos) {
	        return Integer.compare(otroJugador.puntos, this.puntos);
	    }
	    return this.nombre.compareToIgnoreCase(otroJugador.nombre);
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	
}
