package Unidad8Caso1;

import java.util.Random;

public class telefonoFijo extends telefono {

	private String marca;
	private String modelo;

	public telefonoFijo() {
		this.marca = "MSE";
		this.modelo = "7712";
	}
	
	public telefonoFijo(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public telefonoFijo(int numero, int recibirllamada, String marca, String modelo) {
		super(numero, recibirllamada);
		this.setMarca(marca);
		this.modelo = modelo;
	}

	public telefonoFijo(int numero, String marca, String modelo) {
		super(numero);
		this.setMarca(marca);
		this.modelo = modelo;
	}

	public telefonoFijo(int numero, int recibirllamada) {
		super(numero, recibirllamada);
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca() {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo() {
		this.modelo = modelo;
	}

	public static int llamar(int num) {
		Random ran = new Random();
		int numRan = ran.nextInt(4) + 1;
		String marca = "";
		String modelo = "Domo";
		if (numRan == 1)
			marca = "Panasonic";
		else if (numRan == 2)
			marca = "Alcatel";
		else if (numRan == 3)
			marca = "Motorola";
		else
			marca = "Nokia";
		System.out.println("Llamando al numero " + num + "\n" + "Con marca " + marca + "\n" + "Con modelo: " + modelo
				+"\n");
		return num;
	}

	@Override
	public String toString() {
		return "telefonoFijo [marca=" + getMarca() + ", modelo=" + modelo + ", toString()=" + super.toString() + "]";
	}

	public String setMarca(String marca) {
		this.marca = marca;
		return marca;
	}

}
