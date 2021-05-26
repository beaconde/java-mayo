package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {

    private GraficoCompuesto graficoCompuesto;
    private Circulo circulo;
    private Rectangulo rectangulo;
    private Punto punto;

    @BeforeEach
    void setUp() throws Exception {
        punto = new Punto(5, 10);
        rectangulo = new Rectangulo(10, 5, 10, 15);
        circulo = new Circulo(7, 8, 4);

        graficoCompuesto = new GraficoCompuesto();
        graficoCompuesto.addGrafico(punto);
        graficoCompuesto.addGrafico(rectangulo);
        graficoCompuesto.addGrafico(circulo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void moverGrafico() throws Exception {
        graficoCompuesto.mover(6, 3);
        String resultado = "El punto se encuentra en la posición (11, 13)." +
                "La esquina izquierda del rectángulo se encuentra en la posición (16, 8)." +
                " Tiene un ancho de 10 y un alto de 0.El centro del círculo se encuentra en la posición (13, 11) y su radio es 4.";
        assertEquals(resultado, graficoCompuesto.dibujar());
    }

    @Test
    void dibujarGrafico() {
        String resultado = "El punto se encuentra en la posición (5, 10)." +
                "La esquina izquierda del rectángulo se encuentra en la posición (10, 5). Tiene un ancho de 10 y un alto de 0." +
                "El centro del círculo se encuentra en la posición (7, 8) y su radio es 4.";
        assertEquals(resultado, graficoCompuesto.dibujar());
    }

    @Test
    void removeGrafico() {
        graficoCompuesto.removeGrafico(rectangulo);
        graficoCompuesto.removeGrafico(punto);
        graficoCompuesto.removeGrafico(circulo);
        String resultado = "";
        assertEquals(resultado, graficoCompuesto.dibujar());
    }

    @Test
    void addGrafico() throws Exception {
        graficoCompuesto.addGrafico(new Punto(4, 5));
        String resultado = "El punto se encuentra en la posición (5, 10)." +
                "La esquina izquierda del rectángulo se encuentra en la posición (10, 5). Tiene un ancho de 10 y un alto de 0." +
                "El centro del círculo se encuentra en la posición (7, 8) y su radio es 4." +
                "El punto se encuentra en la posición (4, 5).";
        assertEquals(resultado, graficoCompuesto.dibujar());
    }

}