package examen;

public class Rectangulo extends Punto {

    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) throws Exception {
        super(x, y);
        setAncho(ancho);
        setAlto(alto);
    }

    @Override
    public boolean mover(int x, int y) throws Exception {
        return super.mover(x, y);
    }

    @Override
    public String dibujar() {
        String resultado = "La esquina izquierda del rectángulo se encuentra en la posición (" + getX() + ", " +
                getY() + "). Tiene un ancho de " + getAncho() + " y un alto de " + getAlto() + ".";
        System.out.println(resultado);
        return resultado;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws Exception {
        if (ancho>0) {
            this.ancho = ancho;
        } else throw new MyException(4);
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) throws Exception {
        if (alto>0) {
            this.ancho = ancho;
        } else throw new MyException(5);
    }

}
