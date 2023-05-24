package Unidad8Caso1;

public class movilCamara extends telefonoMovil  implements camara{

	public movilCamara() {
		super();
		// TODO Auto-generated constructor stub
	}

	public movilCamara(int llamar, int recibirllamada) {
		super(llamar, recibirllamada);
		// TODO Auto-generated constructor stub
	}

	public void sacarFoto() {
		camara.sacarFoto();
	}
}
