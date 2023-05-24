package Unidad8Caso1;

public class movilCamaraRadio extends telefonoFijo implements radio, camara{

	public movilCamaraRadio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public movilCamaraRadio(int numero, int recibirllamada, String marca, String modelo) {
		super(numero, recibirllamada, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	public movilCamaraRadio(int numero, int recibirllamada) {
		super(numero, recibirllamada);
		// TODO Auto-generated constructor stub
	}

	public movilCamaraRadio(int numero, String marca, String modelo) {
		super(numero, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "movilCamaraRadio [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", toString()="
				+ super.toString() + ", getNumero()=" + getNumero() + "]";
	}



}
