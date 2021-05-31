package examen;

public class Circulo extends Punto {

    private int radio;

    public Circulo(int x, int y, int radio) throws Exception {
        super(x, y);
        setRadio(radio);
    }

/*    @Override
    public boolean mover(int x, int y) throws Exception {
        return super.mover(x, y);
    }*/

    @Override
    public String dibujar() {
        String resultado ="El centro del círculo se encuentra en la posición (" + getX() + ", " + getY() +
                ") y su radio es " + getRadio() + ".";
        System.out.println(resultado);
        return resultado;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) throws Exception {
        if (radio>0) {
            this.radio = radio;
        } else throw new MyException(3);
    }

}
