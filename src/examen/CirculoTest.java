package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    void setUp() throws Exception {
        circulo = new Circulo(5, 7, 9);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void exception() throws Exception {
        assertThrows(MyException.class, () -> new Circulo(6, 7, -4));
        assertDoesNotThrow(() -> circulo);
    }

    @Test
    void mover() throws Exception {
        circulo.mover(2, 5);
        assertEquals(7, circulo.getX());
        assertEquals(12, circulo.getY());
    }

    @Test
    void dibujar() {
        String resultado = "El centro del círculo se encuentra en la posición (5, 7) y su radio es 9." ;
        assertEquals(resultado, circulo.dibujar());
    }

}