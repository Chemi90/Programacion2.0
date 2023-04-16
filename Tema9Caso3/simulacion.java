package Tema9Caso3;

public class simulacion {

	public static void main(String[] args) throws DemasiadoCalor, DemasiadoFrio, InterruptedException {
		
		double temperatura = 0;
		int contadorCalor = 0;
		int contadorFrio = 0;
		
		while(contadorCalor <= 15 || contadorFrio <= 5) {
			temperatura = Math.random()*(99-0);
			if (temperatura>50) {
				contadorCalor++;
				throw new DemasiadoCalor("La temperatura esta por encima de 50.");
			}
			if (temperatura<20) {
				contadorFrio++;
				throw new DemasiadoFrio("La temperatura esta por debajo de 20.");
			}
			Thread.sleep((int)(Math.random()*2000));
		}
	}
}
