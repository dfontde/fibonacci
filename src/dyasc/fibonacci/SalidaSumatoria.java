package dyasc.fibonacci;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SalidaSumatoria extends SalidaDecorada {
    public SalidaSumatoria(Salida salida) {
        super(salida);
    }

    @Override
    public void imprimir(List<Integer> secuenciaFibonacci) {
        List<Integer> sumatoria = new LinkedList<>();
        sumatoria.add( secuenciaFibonacci.stream().mapToInt(a -> a).sum() );
        decorada.imprimir( sumatoria );
    }
}
