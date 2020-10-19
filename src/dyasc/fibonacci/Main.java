package dyasc.fibonacci;

import java.util.List;

public class Main {

    private final dyasc.fibonacci.Opciones opciones;
    private int n;

    public Main( String[] args ){
        opciones = new dyasc.fibonacci.Opciones(args);
        n = Integer.parseInt( args[opciones.explícitas() ? 1 : 0 ] );
    }

    public static void main(String[] args) {
        Main main = new Main(args);
        main.ejecutar();
    }

    private void ejecutar() {
        if (opciones.validas()) {
            List<Integer> secuenciaFibonacci = new Fibonacci().secuencia(n);
            opciones.ajustarDirección(secuenciaFibonacci);
            imprimir(secuenciaFibonacci);
        }
        else{
            System.out.println("Opción no válida");
        }
    }

    private void imprimir(List<Integer> secuenciaFibonacci) {
        System.out.print( "fibo<" + secuenciaFibonacci.size() + ">:");
        for ( Integer x: secuenciaFibonacci ){
            System.out.print( opciones.separador() + x );
        }
    }
}
