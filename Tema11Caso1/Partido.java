package Tema11Caso1;

import java.util.Objects;
import java.util.Random;

public class Partido {

	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador ganador;
	private Jugador perdedor;
	
	
	public Partido(Jugador jugador1, Jugador jugador2) {
		super();
		if (jugador1.equals(jugador2)) {
	        throw new IllegalArgumentException("Es el mismo jugador y por lo tanto no puede jugar contra si mismo.");
	    }
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	

	public Jugador getGanador() {
		return ganador;
	}

	public Jugador getJugador1() {
		return jugador1;
	}


	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}


	public Jugador getJugador2() {
		return jugador2;
	}


	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}


	public Jugador getPerdedor() {
		return perdedor;
	}

	public void jugar() {
		Random random = new Random();
		int p1 = jugador1.getPuntos()/(jugador1.getPuntos()+jugador2.getPuntos());
		int p2 = jugador2.getPuntos()/(jugador2.getPuntos()+jugador2.getPuntos());

        double numRand = random.nextInt(1);
        
        if (p1>p2) {
        	if (numRand>0 && numRand<p1) {
        		this.ganador = jugador1;
        		this.perdedor = jugador2;
        	}
        	else {
        		this.ganador = jugador2;
        		this.perdedor = jugador1;
        	}
        }
        if (p1==p2) {
        	if (numRand>0 && numRand<p1) {
        		this.ganador = jugador1;
        		this.perdedor = jugador2;
        	}
        	else {
        		this.ganador = jugador2;
        		this.perdedor = jugador1;
        	}
        }
        else {
        	if (numRand>0 && numRand<p1) {
        		this.ganador = jugador2;
        		this.perdedor = jugador1;
        	}
        	else {
        		this.ganador = jugador1;
        		this.perdedor = jugador2;
        	}
        }
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(ganador, jugador1, jugador2, perdedor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(ganador, other.ganador) && Objects.equals(jugador1, other.jugador1)
				&& Objects.equals(jugador2, other.jugador2) && Objects.equals(perdedor, other.perdedor);
	}


	@Override
	public String toString() {
				if (ganador!=null) return "Partido [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", ganador=" + ganador + ", perdedor=" + perdedor + "]";
				else {
					jugar();
					return "Partido [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", ganador=" + ganador + ", perdedor=" + perdedor + "]";
				}
	}
	
}