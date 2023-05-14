package projectRectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RectangleTest {

	/*
	 * variable global para usar en el afterEach
	 */
	private static int i = 1;
	
	/*
	 * texto en el que comenzamos el test
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Setup for test complete.");
	}

	/*
	 * texto en el que terminamos el test
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Test complete.");
	}

	/*
	 * texto en el que indicamos el final de cada test unitario
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test "+i+" completed succesfully.");
		i++;
	}

	/*
	 * comprueba que height es 0 y width es 0
	 */
	@Test
	void test1() {
		Rectangle r = new Rectangle(0, 0);
		double expected = 0.0;
		assertEquals(expected, r.getH(), r.getW());
	}

	/*
	 * comprueba que height es 0, width es 0, área es 0
	 */
	@Test
	void test2() {
		Rectangle r = new Rectangle(0, 0);
		assertEquals(0, r.getH());
		assertEquals(0, r.getW());
	}
	
	/*
	 * comprueba que height es 10, width es 20, área es 200
	 */
	@Test
	void test3() {
		Rectangle r = new Rectangle(10, 20);
		assertEquals(10, r.getH());
		assertEquals(20, r.getW());
		assertEquals(200, r.getA());
	}
	
	/*
	 * comprueba en un array de 5 rectangulos con
	 * valores predefinidos
	 */
	@Test
	void test4() {
		Rectangle[] r = new Rectangle[5];
        
        r[0] = new Rectangle(0,0);
        r[1] = new Rectangle(2,3);
        r[2] = new Rectangle(4,6);
        r[3] = new Rectangle(6,9);
        r[4] = new Rectangle(8,12);
        
        assertEquals(0, r[0].getH());
        assertEquals(0, r[0].getW());
        assertEquals(0, r[0].getA());
        
        assertEquals(2, r[1].getH());
        assertEquals(3, r[1].getW());
        assertEquals(6, r[1].getA());
        
        assertEquals(4, r[2].getH());
        assertEquals(6, r[2].getW());
        assertEquals(24, r[2].getA());
        
        assertEquals(6, r[3].getH());
        assertEquals(9, r[3].getW());
        assertEquals(54, r[3].getA());
        
        assertEquals(8, r[4].getH());
        assertEquals(12, r[4].getW());
        assertEquals(96, r[4].getA());
	}
	
	/*
	 * comprueba en un array de 5 rectangulos los valores 
	 * son (height multiplo de 11 y width múltiplos de 7)
	 */
	@Test
	void test5() {
		Rectangle[] r = new Rectangle[5];
        
        r[0] = new Rectangle(0,0);
        r[1] = new Rectangle(11, 7);
        r[2] = new Rectangle(r[1].getH()*2,r[1].getW()*2);
        r[3] = new Rectangle(r[1].getH()*3,r[1].getW()*3);
        r[4] = new Rectangle(r[1].getH()*4,r[1].getW()*4);
        
        assertEquals(0, r[0].getH());
        assertEquals(0, r[0].getW());
        assertEquals(0, r[0].getA());
        
        assertEquals(11, r[1].getH());
        assertEquals(7, r[1].getW());
        assertEquals(77, r[1].getA());
        
        assertEquals(22, r[2].getH());
        assertEquals(14, r[2].getW());
        assertEquals(308, r[2].getA());
        
        assertEquals(33, r[3].getH());
        assertEquals(21, r[3].getW());
        assertEquals(693, r[3].getA());
        
        assertEquals(44, r[4].getH());
        assertEquals(28, r[4].getW());
        assertEquals(1232, r[4].getA());
	}
	
	/*
	 * igual que Test5() pero imprimiendo por pantalla
	 * el contenido de todo el array con el toString
	 */
	@Test
	void test6() {
		Rectangle[] r = new Rectangle[5];
        
        r[0] = new Rectangle(0,0);
        r[1] = new Rectangle(11, 7);
        r[2] = new Rectangle(r[1].getH()*2,r[1].getW()*2);
        r[3] = new Rectangle(r[1].getH()*3,r[1].getW()*3);
        r[4] = new Rectangle(r[1].getH()*4,r[1].getW()*4);
        
        System.out.println(r[0].toString());
        System.out.println(r[1].toString());
        System.out.println(r[2].toString());
        System.out.println(r[3].toString());
        System.out.println(r[4].toString());
        
        assertEquals(0, r[0].getH());
        assertEquals(0, r[0].getW());
        assertEquals(0, r[0].getA());
        
        assertEquals(11, r[1].getH());
        assertEquals(7, r[1].getW());
        assertEquals(77, r[1].getA());
        
        assertEquals(22, r[2].getH());
        assertEquals(14, r[2].getW());
        assertEquals(308, r[2].getA());
        
        assertEquals(33, r[3].getH());
        assertEquals(21, r[3].getW());
        assertEquals(693, r[3].getA());
        
        assertEquals(44, r[4].getH());
        assertEquals(28, r[4].getW());
        assertEquals(1232, r[4].getA());
	}
}
