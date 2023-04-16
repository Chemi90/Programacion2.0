package tema9Caso2;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws ExcepcionDiaSup100, ExcepcionDiaInf20 {

		try {
		
		final int tamaño = 10;

		Mundo[] mun = new Mundo[tamaño];

		Scanner sc = new Scanner(System.in);

		String nombre;
		float diam;
		boolean hab;

		Mundo m = new Mundo();
		
		for (int i = 0; i < tamaño; i++) {
			mun[i] = m;
		}

		for (int i = 0; i < tamaño; i++) {
			System.out.print("Introduce el nombre " + " del planera numero " + i + ":");
			nombre = sc.next();
			System.out.print("Introduce el diametro en km: ");
			diam = sc.nextFloat();
			System.out.print("Introduce si es habitable: ");
			hab = sc.nextBoolean();
			mun[i].setNombre(nombre);
			mun[i].setDiametro(diam);
			mun[i].setHabitable(hab);
		}

		
		
		int i = 0;
		while (i < tamaño) {
			if (mun[i].getDiametro() > 100) {
				i = tamaño + 1;
				throw new ExcepcionDiaSup100();
			} else if (mun[i].getDiametro() < 20) {
				throw new ExcepcionDiaInf20();
			}
			sc.close();
		}
		}catch (ExcepcionDiaSup100 e) {
			System.out.println("Diametro superior a 100km.");
		}
		catch (ExcepcionDiaInf20 e) {
			System.out.println("Diametro inferior a 20km.");
		}
		catch (Exception e) {
			System.out.println("HA OCURRIDO UNA EXCEPCION.");
		}
	}
}
