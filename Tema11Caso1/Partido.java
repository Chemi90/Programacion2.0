package Tema11Caso1;

import java.util.Random;

public class Partido {

	private Jugador jugador1;
	private Jugador jugador2;
	
	
	public Partido(Jugador jugador1, Jugador jugador2) {
		super();
		if (jugador1.equals(jugador2)) {
	        throw new IllegalArgumentException("Es el mismo jugador y por lo tanto no puede jugar contra si mismo.");
	    }
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public int jugar() {
		Random random = new Random();
		int p1 = jugador1.getPuntos()/(jugador1.getPuntos()+jugador2.getPuntos());
		int p2 = jugador2.getPuntos()/(jugador2.getPuntos()+jugador2.getPuntos());

        double numRand = random.nextInt(1);
        
        if (p1>p2) {
        	if (numRand>0 && numRand<p1) return 1;
        	else return -1;
        }
        if (p1==p2) {
        	if (numRand>0 && numRand<p1) return 1;
        	else return -1;
        }
        else {
        	if (numRand>0 && numRand<p1) return -1;
        	else return 1;
        }
	}
	
	public Jugador ganador(int jugar) {
		if (jugar())
		
	}

	@Override
	public String toString() {
		return "Partido [jugador1=" + jugador1 + ", jugador2=" + jugador2 + "]";
	}
	
}