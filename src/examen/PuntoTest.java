package examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PuntoTest {

    private Punto punto;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {
        punto = new Punto(5, 7);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void exception() throws Exception {
        assertThrows(MyException.class, () -> new Punto(801, 600));
        assertThrows(MyException.class, () -> new Punto(800, 601));
        assertDoesNotThrow(() -> punto);
    }

    @Test
    void mover() throws Exception {
        punto.mover(5, 2);
        assertEquals(10, punto.getX());
        assertEquals(9, punto.getY());
    }

    @Test
    void dibujar() {
        String resultado = "El punto se encuentra en la posición (5, 7).";
        assertEquals(resultado, punto.dibujar());
    }

}