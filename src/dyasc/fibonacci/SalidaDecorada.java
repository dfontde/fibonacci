package dyasc.fibonacci;

import java.util.List;

public abstract class SalidaDecorada implements Salida {

    protected Salida decorada;

    public SalidaDecorada(Salida decorada ){
        this.decorada = decorada;
    }

    public SalidaDecorada separador(String separador){
        this.decorada.separador( separador );
        return this;
    }

    public void imprimir(List<Integer> secuenciaFibonacci){
        this.decorada.imprimir(secuenciaFibonacci);
    }
}
