package Tema9Caso1;

public class DivisionPorCero {

	public void division(double num1, double num2) throws ExcepcionDeDivisionPorCero {
		if (num2 == 0) {
			throw new ExcepcionDeDivisionPorCero();
		} else {
			double resultado = num1 / num2;
			System.out.println("El resultado de la division sera: " + resultado);
		}
	}

}
