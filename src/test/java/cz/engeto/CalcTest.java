package cz.engeto;

import org.junit.jupiter.api.*;

class CalcTest {

    Calc calc;

    @BeforeEach
    void init() {
        calc = new Calc();
    }

    @AfterEach
    void tearUp() {

    }

    @Test
    @DisplayName("Test scitani dvou celych kladnych cisel")
    void testScitani() {

        int expected = 5;
        int actual = calc.scitani(2, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testScitaniBiggerThanZero() {

        int expected = 0;
        int actual = calc.scitani(2, 3);

        Assertions.assertTrue(actual > expected);
    }

    @Test
    void testOdcitani() {

        Assertions.assertEquals(0, calc.odcitani(2,2));
    }

    @Test
    void testNasobeni() {

        int expected = 6;
        int actual = calc.nasobeni(2,3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNasobeniZapornymCislem() {

        int expected = -6;
        int actual = calc.nasobeni(2,-3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDeleniNulou() {

        Exception expected = Assertions.assertThrows(ArithmeticException.class, () -> calc.deleni(12,0));

        Assertions.assertEquals("/ by zero", expected.getMessage());
    }
}
