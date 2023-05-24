package Unidad8Caso1;

import java.util.Random;

public class telefonoMovil extends telefono{

	private String operador;

	public telefonoMovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public telefonoMovil(int numero, int recibirllamada) {
		super(numero, recibirllamada);
		// TODO Auto-generated constructor stub
	}
	public telefonoMovil(int numero) {
		super(numero);
	}

	public String getOperador() {
		return operador;
	}

	private void setOperador() {
		this.operador=operador;
	}
	
	public static int llamar (int num) {
		Random ran = new Random();
		int numRan = ran.nextInt(4) + 1;
		String operador="";
		if(numRan==1)operador= "Vodafone";
		else if (numRan==2)operador= "Orange";
		else if (numRan==3)operador= "Movistar";
		else operador= "Axartel";
		System.out.println("Llamando al operador: "+operador+"\nCon numero: " + num+"\n");
		return num;
	}

	@Override
	public String toString() {
		return "telefonoMovil [operador=" + getOperador() + ", toString()=" + super.toString() + "]";
	}
	
	
}
