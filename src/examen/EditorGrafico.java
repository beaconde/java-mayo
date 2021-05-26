package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EditorGrafico {

    public static void main(String[] args) throws Exception {

        Punto punto = new Punto(5, 10);
        Rectangulo rectangulo = new Rectangulo(10, 5, 10, 15);
        Circulo circulo = new Circulo(7, 8, 4);

        GraficoCompuesto graficoCompuesto = new GraficoCompuesto();
        graficoCompuesto.addGrafico(punto);
        graficoCompuesto.addGrafico(rectangulo);
        graficoCompuesto.addGrafico(circulo);

        graficoCompuesto.dibujar();

        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("¿Qué quieres hacer?\n1. Mover el gráfico.\n2. Salir.\n");
        String opcion;
        opcion = entrada.nextLine();
        opcion = opcion.toLowerCase();

        switch(opcion) {

            case "mover": {

                System.out.println("En el eje x: ");
                int x;

                while(true) {
                    try {
                        x = entrada.nextInt();
                        entrada.nextLine();
                        break;
                    } catch(InputMismatchException e) {
                        entrada.nextLine();
                        System.out.println("Debes introducir un número.");
                    }
                }

                System.out.println("En el eje y: ");
                int y;

                while(true) {
                    try {
                        y = entrada.nextInt();
                        entrada.nextLine();
                        break;
                    } catch(InputMismatchException e) {
                        entrada.nextLine();
                        System.out.println("Debes introducir un número.");
                    }
                }

                System.out.println("\nSe han movido los gráficos:\n");
                graficoCompuesto.mover(x, y);
                graficoCompuesto.dibujar();
            }
            case "salir": {

                System.out.println();
                System.out.println("Saliendo del programa :)");

            }

        }


    }

}
