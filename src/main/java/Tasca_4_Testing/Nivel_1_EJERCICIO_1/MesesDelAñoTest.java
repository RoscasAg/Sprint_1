package Tasca_4_Testing.Nivel_1_EJERCICIO_1;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;


public class MesesDelAñoTest {
    @Test
    public void testObtenerMeses() {
        List<String> meses = MesesDelAño.obtenerMeses();

        assertNotNull(meses);

        assertEquals(12, meses.size());

        assertEquals("Agosto", meses.get(7));
    }
}
