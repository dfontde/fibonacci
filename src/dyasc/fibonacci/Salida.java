package dyasc.fibonacci;

import java.util.List;

public interface Salida {
    public void imprimir(List<Integer> secuenciaFibonacci);
    public Salida separador(String separador);
}
