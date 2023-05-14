package Tema11Caso1;

import java.util.Set;
import java.util.TreeSet;

public class TorneoATP extends Torneo {

	public TorneoATP(Set<Jugador> list) {
		super(list);
	}

	public void formarPrimeraRonda() {
		TreeSet<Jugador> atp = new TreeSet<>();

		atp.addAll(super.getJugadores());

		for (int i = 0; i < super.getJugadores().size(); i += 2) {
			Partido p = new Partido(atp.first(), atp.last());
			super.getTabla().add(p);
			atp.remove(atp.first());
			atp.remove(atp.last());
		}
	}
}
