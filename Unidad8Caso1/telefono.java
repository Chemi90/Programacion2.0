package Unidad8Caso1;

public abstract class telefono {

	private int numero;
	private int recibirllamada;
	
	public telefono(int numero, int recibirllamada) {
		super();
		this.numero = numero;
		this.recibirllamada = recibirllamada;
	}
	
	public telefono(int numero) {
		super();
		this.numero = numero;
	}
	public telefono() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getRecibirllamada() {
		return recibirllamada;
	}

	public void setRecibirllamada(int recibirllamada) {
		this.recibirllamada = recibirllamada;
	}

	public static int llamar (int num) {
		System.out.println("Llamando al numero: "+num+"\n");
		return num;
	}
	
	
	@Override
	public String toString() {
		return "telefono [Mi numero es=" + numero+"]";
	}
	
	
	
}
