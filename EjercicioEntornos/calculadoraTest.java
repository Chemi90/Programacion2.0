package EjercicioEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class calculadoraTest {

	
	/**
	 * Metodo que sale el primero siempre, en este caso lo uso para avisar del inicio de los test
	 */
	@BeforeAll
	static void setUp() {
		System.out.println("COMIENZO DE LAS OPERACIONES");
	}

	/**
	 * Metodo que siempre se sale antes de que entre cualquier otro test
	 */
	@BeforeEach
	void beforeEachTest() {
		System.out.println("-----------------------------");
	}

	/**
	 * Metodo que siempre salta despues de cualquier otro metodo,
	 * en este caso lo uso junto con el @BeforeEach para hacer separacion de un test a otro
	 */
	@AfterEach
	void afterEachTest() {
		System.out.println("=============================");
	}

	/**
	 * Metodo que siempre saltara al final para indicar la finalizacion de los test
	 */
	@AfterAll
	static void tearDown() {
		System.out.println("FIN DE LAS OPERACIONES");
	}

	/**
	 * test en el que se ve como acertaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testSumarOK() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.suma(2, 3);
		System.out.println("Test Sumar OK \n" + "El resultado esperado de la Suma es: " + 5 + "\n"
				+ "El resultado actual de la Suma es: " + resultado);
		assertEquals(5, resultado);
	}

	/**
	 * test en el que se ve como acertaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testRestarOK() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.resta(3, 2);
		System.out.println("Test Restar OK \n" + "El resultado esperado de la Resta es: " + 1 + "\n"
				+ "El resultado actual de la Resta es: " + resultado);
		assertEquals(1, resultado);
	}

	/**
	 * test en el que se ve como fallaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testSumarFallo() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.suma(2, 3);
		System.out.println("Test Sumar Fallo \n" + "El resultado esperado de la Suma es: " + 3 + "\n"
				+ "El resultado actual de la Suma es: " + resultado);
		assertEquals(3, resultado);
	}

	/**
	 * test en el que se ve como fallaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testRestarFallo() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.resta(3, 2);
		System.out.println("Test Restar Fallo \n" + "El resultado esperado de la Resta es: " + 8 + "\n"
				+ "El resultado actual de la Resta es: " + resultado);
		assertEquals(8, resultado);
	}

	/**
	 * test en el que se ve como acertaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testMultiplicarOK() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.multiplicar(2, 3);
		System.out.println("Test Multiplicar OK \n" + "El resultado esperado de la Multiplicar es: " + 6 + "\n"
				+ "El resultado actual de la Multiplicar es: " + resultado);
		assertEquals(6, resultado);
	}

	/**
	 * test en el que se ve como acertaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testDividirOK() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(6, 3);
		System.out.println("Test Dividir OK \n" + "El resultado esperado de la Dividir es: " + 2 + "\n"
				+ "El resultado actual de la Dividir es: " + resultado);
		assertEquals(2, resultado);
	}

	/**
	 * test en el que se ve como fallaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testMultiplicarFallo() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.multiplicar(2, 3);
		System.out.println("Test Multiplicar Fallo \n" + "El resultado esperado de la Multiplicar es: " + 9 + "\n"
				+ "El resultado actual de la Multiplicar es: " + resultado);
		assertEquals(9, resultado);
	}

	/**
	 * test en el que se ve como fallaria al usar el metodo indicado de la calculadora
	 */
	@Test
	public void testDividirFallo() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(6, 3);
		System.out.println("Test Dividir Fallo \n" + "El resultado esperado de la Dividir es: " + 15 + "\n"
				+ "El resultado actual de la Dividir es: " + resultado);
		assertEquals(15, resultado);
	}

	/**
	 * test en el que se verifica si 3 numeros dados son dividbles entre 11
	 * y en este caso indica si es posible o no
	 * 
	 * @param numero
	 */
	@ParameterizedTest
	@ValueSource(doubles = { 33, 68, 127 })
	void testDivisiblePor11(double numero) {
		boolean divisiblePor11 = numero % 11 == 0;
		String mensaje = "El número " + numero + " ";
		if (divisiblePor11) {
			mensaje += "SI";
		} else {
			mensaje += "NO";
		}
		mensaje += " es divisible por 11";
		System.out.println(mensaje);
		assertEquals(divisiblePor11, true);
	}

	/**
	 * test en el que saldria la tabla de multiplicar del 5
	 * desde el mumero 1 al numero 10
	 */
	@DisplayName("Tabla de multiplicar del 5")
    @RepeatedTest(10)
    void testTablaMultiplicarDel5(RepetitionInfo repetitionInfo) {
        int i = repetitionInfo.getCurrentRepetition();
        int resultado = 5 * i;
        System.out.println(5 + "x" + i + "=" + resultado);
    }
}