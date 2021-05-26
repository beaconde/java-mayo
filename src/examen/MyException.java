package examen;

public class MyException extends Exception {

    private int codigo;

    public MyException(int codigo) {
        super();
        this.codigo = codigo;
    }

    @Override
    public String getMessage() {
        String message = "";
        switch (codigo) {
            case 1:
                message = "Error: la coordenada x se sale de la pantalla";
                break;
            case 2:
                message = "Error: la coordenada y se sale de la pantalla;";
                break;
            case 3:
                message = "Error: el radio no puede ser negativo.";
                break;
            case 4:
                message = "Error: el ancho no puede ser negativo.";
                break;
            case 5:
                message = "Error: el alto no puede ser negativo.";
                break;
        }
        return message;
    }

}
