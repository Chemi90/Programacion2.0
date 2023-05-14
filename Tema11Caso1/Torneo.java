package Tema11Caso1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.platform.engine.support.discovery.SelectorResolver.Match;

public class Torneo {

	private Set<Jugador> jugadores = new TreeSet<>();
	private Jugador Campeon = null;
	private List<Partido> tabla = new ArrayList<>();
	private List<Jugador> jugadoresJugando = new ArrayList<>();

	public Torneo(Set<Jugador> list) {
		try {
			if ((list.size() & (list.size() - 1)) != 0) {
				throw new TorneoException(null);
			} else
				jugadores.addAll(list);
		} catch (TorneoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

	public Set<Jugador> getJugadores() {
		return jugadores;
	}



	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}



	public Jugador getCampeon() {
		return Campeon;
	}



	public void setCampeon(Jugador campeon) {
		Campeon = campeon;
	}



	public List<Partido> getTabla() {
		return tabla;
	}



	public void setTabla(List<Partido> tabla) {
		this.tabla = tabla;
	}



	public List<Jugador> getJugadoresJugando() {
		return jugadoresJugando;
	}



	public void setJugadoresJugando(List<Jugador> jugadoresJugando) {
		this.jugadoresJugando = jugadoresJugando;
	}



	public void formarPrimeraRonda() {

		List<Jugador> listaJugadores = new ArrayList<>();
		listaJugadores.addAll(jugadores);
		Collections.shuffle(listaJugadores);
		for (int i = 0; i < listaJugadores.size(); i += 2) {
			Partido m1 = new Partido(listaJugadores.get(i), listaJugadores.get(i + 1));
			tabla.add(m1);
		}
	}

	public void jugarRonda() {
		if (!rondaJugada()) {
			for (Partido m : tabla) {
				m.jugar();
				if (tabla.size() == 1) {
					Campeon = m.getGanador();
				}

				if (m.getGanador().equals(m.getJugador1())) {
					jugadores.remove(m.getJugador2());
					jugadoresJugando.add(m.getJugador1());
				} else {
					jugadores.remove(m.getJugador1());
					jugadoresJugando.add(m.getJugador2());
				}
			}
		} else
			System.out.println("No se ha jugado");
	}

	public void formarRonda() {
		if (rondaJugada()) {
			tabla.clear();

			while (jugadoresJugando.size() >= 2) {
				Partido p = new Partido(jugadoresJugando.get(0), jugadoresJugando.get(jugadoresJugando.size() - 1));
				tabla.add(p);
				jugadoresJugando.remove(jugadoresJugando.get(0));
				jugadoresJugando.get(jugadoresJugando.size() - 1);
			}
		}
	}

	public String enCompeticion() {
		String nom = "";
		List<String> nombres = new ArrayList<>();
		for (Jugador m : jugadores)
			nombres.add(m.getNombre());
		Collections.sort(nombres);
		for (String s : nombres)
			nom = nom + "* " + s + "\n";
		return nom;
	}
	
	 public String partidos() {
	        StringBuilder sb = new StringBuilder();
	        for (Partido partido : tabla) {
	            sb.append(partido.getJugador1().getNombre())
	              .append(" vs. ")
	              .append(partido.getJugador2().getNombre())
	              .append(": ");
	            sb.append("\n");
	        }
	        return sb.toString();
	    }

	public boolean rondaJugada() {
		if (jugadores.size() == (tabla.size() + 2)) {
			return false;
		} else
			return true;
	}
}
