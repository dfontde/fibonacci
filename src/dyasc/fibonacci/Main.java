package dyasc.fibonacci;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> secuenciaFibonacci = new Fibonacci().secuencia(n);
        imprimir( secuenciaFibonacci );
    }

    private static void imprimir(List<Integer> secuenciaFibonacci) {
        System.out.print( "fibo<" + secuenciaFibonacci.size() + ">: ");
        for ( Integer x: secuenciaFibonacci ){
            System.out.print(x + " ");
        }
    }
}
