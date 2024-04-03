package Tasca_4_Testing.Nivel_1_EJERCICIO_2;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int numeroDni;
    private char letraEsperada;

    public CalculoDniTest(int numeroDni, char letraEsperada) {
        this.numeroDni = numeroDni;
        this.letraEsperada = letraEsperada;
    }



    @Parameterized.Parameters
    public static Collection<Object[]> datosParaTest() {
        return Arrays.asList(new Object[][] {
                {12345678, 'Z'},
                {23456789, 'D'},
                {34567890, 'V'},
                {45678901, 'G'},
                {56789012, 'B'},
                {67890123, 'B'},
                {78901234, 'X'},
                {78901230, 'Y'},
                {78901238, 'Z'},
                {78901239, 'S'},

        });
    }

    @Test
    public void testCalcularLetra() {
        Assert.assertEquals("La letra calculada no es la esperada para el DNI " + numeroDni,
                letraEsperada, CalculoDni.calcularLetra(numeroDni));
    }

}
