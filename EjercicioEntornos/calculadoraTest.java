package EjercicioEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	
	//Prueba Unitaria
	/*se pueden escribir casos de prueba para probar cada método individualmente*/
	@Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(5, 2);
        assertEquals(3, resultado);
    }
    
    //Prueba Integracion
    /*Las pruebas de integración aseguran que todos los componentes de un sistema funcionen correctamente juntos*/
    @Test
    public void testSumaYResta() {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.suma(3, 5);
        double resultadoResta = calculadora.resta(7, 2);
        assertEquals(8, resultadoSuma);
        assertEquals(5, resultadoResta);
    }

    //Pruebas de regresion
    /*se utilizan para verificar que las nuevas implementaciones o 
     * cambios en el código no han causado que los errores previamente corregidos vuelvan a aparece*/
    @Test
    public void testSumaConCero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(2, 0);
        assertEquals(2, resultado);
    }
    
    //Pruebas de validacion
    /*Se utilizan para verificar que el software cumpla con los requisitos del usuario y las especificaciones del sistema*/
    @Test
    public void testSumaNegativos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.suma(-2, -3);
        assertEquals(-5, resultado);
    }
    
    //Pruebas de Sistema y Rendimiento (pre-producción)
    /*se utilizan para verificar que el software funcione correctamente en el entorno de producción y 
     * que pueda manejar la carga de trabajo esperada*/
    @Test
    public void testRendimientoSuma() {
        Calculadora calculadora = new Calculadora();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            calculadora.suma(2, 3);
        }
        long endTime = System.currentTimeMillis();
        long tiempoTotal = endTime - startTime;
        System.out.println("Tiempo total para sumar 1000000 veces: " + tiempoTotal + "ms");
        assertEquals(5, tiempoTotal);
    }
    
    /*La prueba de aceptacion no se puede llevar a cabo ya que no nos han enseñado en ningun momento
     * como seria el entorno de produccion de una aplicacion y por lo tanto seria imposible de verificar.
     */
}
