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

    public void setX(int x) throws MyException {
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

    public boolean mover(int x, int y) {
//        if(this.x + x <= 800 && this.y + y <= 600) {
        try {
            setX(this.x + x);
            setY(this.y + y);
            return true;
//        } else return false;
        } catch(MyException e) {
            return false;
        }
    }

    public String dibujar() {
        String resultado = "El punto se encuentra en la posición (" + getX() + ", " + getY() + ").";
        System.out.println(resultado);
        return resultado;
    }
}
