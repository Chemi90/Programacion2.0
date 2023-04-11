package Tema9Caso1;

public class main {

	public static void main(String[] args) {

		DivisionPorCero div = new DivisionPorCero();

		try {
			div.division(10, 2);
		} catch (ExcepcionDeDivisionPorCero e) {
			System.out.println(e.getMessage());
		}
	}
}
