package Tasca_4_Testing.Nivel_1_EJERCICIO_1;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;


public class MesesDelAñoTest {
    @Test
    public void testObtenerMesesNotNull() {
        List<String> meses = MesesDelAño.obtenerMeses();
        assertNotNull("La lista de meses no tiene que ser null",meses);
    }

    @Test
    public void testObtenerMeses_TamañoCorrecto() {
        List<String> meses = MesesDelAño.obtenerMeses();
        assertEquals("La lista de meses tiene que contener 12 elementos", 12, meses.size());
    }

    @Test
    public void TestObtenerMeses_ContienAgostoEnPosicioncorrecta(){
        List<String> meses = MesesDelAño.obtenerMeses();
        assertEquals("El mes 8 tiene que ser Agosto","Agosto", meses.get(7));
    }
}
