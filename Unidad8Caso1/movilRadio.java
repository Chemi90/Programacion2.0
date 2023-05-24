package Unidad8Caso1;

public class movilRadio extends telefonoMovil implements radio{

	public movilRadio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public movilRadio(int llamar, int recibirllamada) {
		super(llamar, recibirllamada);
		// TODO Auto-generated constructor stub
	}
	
	public void escuchar() {
		radio.escuchar();
	}
}
