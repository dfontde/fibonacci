package dyasc.fibonacci;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Main {

    private final Opciones opciones;

    public Main( String[] args ) throws IOException {
        opciones = new Opciones(args);
    }

    public static void main(String[] args) throws IOException{
        Main main = new Main(args);
        main.ejecutar();
    }

    private void ejecutar(){
        List<Integer> secuenciaFibonacci = new Fibonacci().secuencia(opciones.n());
        opciones.salida().imprimir(secuenciaFibonacci);
    }
}
