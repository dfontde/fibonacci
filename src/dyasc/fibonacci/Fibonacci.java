package dyasc.fibonacci;

import java.util.LinkedList;
import java.util.List;

public class Fibonacci {
    public List<Integer> secuencia(int n) {
        List<Integer> secuencia  = new LinkedList<Integer>();
        for ( int i = 0; i < n; i++ ){
            secuencia.add( i < 2 ? i : secuencia.get(i-1) + secuencia.get(i-2));
        }
        return secuencia;
    }
}
