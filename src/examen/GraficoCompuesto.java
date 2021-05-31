package examen;

import java.util.ArrayList;

public class GraficoCompuesto implements Grafico {

    private ArrayList<Grafico> listaGraficos;

    public GraficoCompuesto() {
        listaGraficos = new ArrayList<Grafico>();
    }

    public void addGrafico(Grafico grafico) {
        listaGraficos.add(grafico);
    }

    public void removeGrafico(Grafico grafico) {
        listaGraficos.remove(grafico);
    }

    public ArrayList<Grafico> getListaGraficos() {
        return listaGraficos;
    }

    public void setListaGraficos(ArrayList<Grafico> listaGraficos) {
        this.listaGraficos = listaGraficos;
    }

    @Override
    public boolean mover(int x, int y) throws Exception {
/*        for (int i=0; i< listaGraficos.size() ; i++) {

            if (listaGraficos.get(i) instanceof Circulo) {
                Circulo circulo = (Circulo) listaGraficos.get(i);
                circulo.mover(x, y);
            } else if (listaGraficos.get(i) instanceof Rectangulo) {
                Rectangulo rectangulo = (Rectangulo) listaGraficos.get(i);
                rectangulo.mover(x, y);
            } else if (listaGraficos.get(i) instanceof Punto) {
                Punto punto = (Punto) listaGraficos.get(i);
                punto.mover(x, y);
            }

        }*/
        boolean dentroPantalla = true;
        for(Grafico grafico : listaGraficos) {
            if (!grafico.mover(x, y)) {dentroPantalla=false;}
        }
        return dentroPantalla;
    }

    @Override
    public String dibujar() {
        String resultado ="";
        for (int i=0; i< listaGraficos.size() ; i++) {

            if (listaGraficos.get(i) instanceof Circulo) {
                Circulo circulo = (Circulo) listaGraficos.get(i);
                resultado += circulo.dibujar();
            } else if (listaGraficos.get(i) instanceof Rectangulo) {
                Rectangulo rectangulo = (Rectangulo) listaGraficos.get(i);
                resultado += rectangulo.dibujar();
            } else if (listaGraficos.get(i) instanceof Punto) {
                Punto punto = (Punto) listaGraficos.get(i);
                resultado += punto.dibujar();
            }

        }
        return resultado;
    }

}
