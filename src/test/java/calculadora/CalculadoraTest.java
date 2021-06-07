package calculadora;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void init(){
        calculadora = new Calculadora();
    }

    @Test
    public void sumarTest(){
        assertEquals (0,calculadora.sumar(""));
        assertEquals (0,calculadora.sumar("0,0"));


        assertEquals (3,calculadora.sumar("3"));
        assertEquals (10,calculadora.sumar("2,8"));
        assertEquals (5,calculadora.sumar("3,2"));
        assertEquals (17,calculadora.sumar("2,15"));

        assertEquals (0,calculadora.sumar(","));
        assertEquals (0,calculadora.sumar("3,"));

        assertEquals(25, calculadora.sumar("3,15,7"));
        assertEquals(33, calculadora.sumar("3,15,15"));
        assertEquals(2, calculadora.sumar("1,0,1"));
        assertEquals(303, calculadora.sumar("101,101,101"));
        assertEquals(1227, calculadora.sumar("10,1,991,225"));
        assertEquals(1227, calculadora.sumar("10n1,991,225"));

        //TODO
        // assertEquals (0,calculadora.sumar(",8"));

    }

    @Test(expected = NumberFormatException.class)
    public void wrongCharacterTest(){
        calculadora.sumar("#~@¬[]{}─");
    }




}
