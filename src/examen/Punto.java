package examen;

public class Punto implements Grafico {

    protected int x;
    protected int y;

    public Punto(int x, int y) throws Exception {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Exception {
        if (x<=800) {
            this.x = x;
        } else throw new MyException(1);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Exception {
        if (y<=600) {
            this.y = y;
        } else throw new MyException(2);
    }

    @Override
    public boolean mover(int x, int y) throws Exception {
        if(this.x + x <= 800 && this.y + y <= 600) {
            setX(this.x + x);
            setY(this.y + y);
            return true;
        } else return false;
    }

    @Override
    public String dibujar() {
        String resultado = "El punto se encuentra en la posición (" + getX() + ", " + getY() + ").";
        System.out.println(resultado);
        return resultado;
    }
}
