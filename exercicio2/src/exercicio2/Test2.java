package exercicio2;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test2 {

	public static double calcularMedia(double a, double b) {
		return (a+b)/2;
	}
	
	@Test
	public void testarMedia() {
		double a = 10;
		double b = 20;
		double resultadoEsperado = 15;
        assertEquals(resultadoEsperado, Test2.calcularMedia(a, b), 0.001);
    }

    @Test
    public void testMediaAritmeticaComNegativos() {
        double a = -5;
        double b = 5;
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, Test2.calcularMedia(a, b), 0.001);
    }

    @Test
    public void testMediaAritmeticaComDecimais() {
        double a = 3.5;
        double b = 6.5;
        double resultadoEsperado = 5; // (3.5 + 6.5) / 2 = 5
        assertEquals(resultadoEsperado, Test2.calcularMedia(a, b), 0.001);
    }
}
