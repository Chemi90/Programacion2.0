package Tema8Caso3;

import java.util.Scanner;

public class CampoDeBatalla {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Elfo Legolas = new Elfo("Legolas");
		Trol Ghun = new Trol("Ghun");
		Enano Gimli = new Enano("Gimli");

		String eleccion = null;
	
		String salir=null;

		while (salir != "salir") {
			System.out
			.println("Haz la eleccion entre luchar, recuperar alguno de los dos, descansar por completo o salir.");
			eleccion = sc.nextLine();
			switch (eleccion) {
			case "luchar":
				if (!Legolas.isMuerto() && !Ghun.isMuerto()) {
					Legolas.luchar(Ghun);
					Ghun.luchar(Legolas);
					if (Legolas.isMuerto()) {
						System.out.println(Ghun.getNombre() + " ha ganado!");
					} else if (Ghun.isMuerto()) {
						System.out.println(Legolas.getNombre() + " ha ganado!");
					}
				} else if (Legolas.isMuerto())
					System.out.println(Legolas.getNombre() + " esta muerto, por lo tanto no pueden luchar.");
				else if (Ghun.isMuerto())
					System.out.println(Ghun.getNombre() + " esta muerto, por lo tanto no pueden luchar.");
				else
					System.out.println("Ambos estan muertos, no pueden luchar.");
				break;
			case "recuperar Legolas":
				Legolas.recuperar();
				break;
			case "recuperar Ghun":
				Ghun.recuperar();
				break;
			case "descansar Legolas":
				Legolas.descansar();
				break;
			case "descansar Ghun":
				Ghun.descansar();
				break;
			case "salir":
				salir="salir";
				break;
			default:
				System.out.println("Eleccion incorrecta, vuelva a elegir.");
				break;
			}
		}
		System.out.println("Buena partida!!");
		sc.close();
	}
}
