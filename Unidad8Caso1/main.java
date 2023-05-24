package Unidad8Caso1;

public class main {

	public static void main(String[] args) {
		
		telefonoFijo fijo1 = new telefonoFijo(952544648, "Panasonic", "Domo");
		telefonoMovil movil1 = new telefonoMovil(655309861);
		
		telefono.llamar(952544648);
		
		telefonoMovil.llamar(655309861);
		
		telefonoFijo.llamar(651238749);
		
		movilCamara moca = new movilCamara();
		movilRadio mora = new movilRadio();
		
		moca.sacarFoto();
		mora.escuchar();

		movilCamaraRadio smartphone = new movilCamaraRadio();
		
		System.out.println(smartphone);
		
	}

}
