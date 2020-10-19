package dyasc.fibonacci;

import java.util.Collections;
import java.util.List;

public class SalidaInversa extends SalidaDecorada {
    public SalidaInversa(Salida salida) {
        super(salida);
    }

    @Override
    public void imprimir(List<Integer> secuenciaFibonacci) {
        Collections.reverse(secuenciaFibonacci);
        decorada.imprimir(secuenciaFibonacci);
    }
}

