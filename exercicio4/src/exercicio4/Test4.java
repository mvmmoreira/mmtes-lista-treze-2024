package exercicio4;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test4 {
    
    public static double converterParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) / 1.8;
    }

    @Test
    public void testConversaoFahrenheitParaCelsius() {

        double temperaturaFahrenheit1 = 32; // 0°C
        double resultadoEsperado1 = 0;
        assertEquals(resultadoEsperado1, Test4.converterParaCelsius(temperaturaFahrenheit1), 0.01);


        double temperaturaFahrenheit2 = -40; // -40°C
        double resultadoEsperado2 = -40;
        assertEquals(resultadoEsperado2, Test4.converterParaCelsius(temperaturaFahrenheit2), 0.01);


        double temperaturaFahrenheit3 = 98.6; // 37°C
        double resultadoEsperado3 = 37;
        assertEquals(resultadoEsperado3, Test4.converterParaCelsius(temperaturaFahrenheit3), 0.01);
    }
}