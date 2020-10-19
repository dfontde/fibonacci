package dyasc.fibonacci;

import java.io.PrintStream;
import java.util.List;

public class SalidaTexto implements Salida {

    public static final String ESPACIO = " ";
    private String separador = ESPACIO;
    private PrintStream texto;

    public SalidaTexto(PrintStream texto ){
        this.texto = texto;
    }

    @Override
    public Salida separador(String separador){
        this.separador = separador;
        return this;
    }

    @Override
    public void imprimir(List<Integer> secuenciaFibonacci) {
        texto.print( "fibo<" + secuenciaFibonacci.size() + ">:");
        for ( Integer x: secuenciaFibonacci ){
            texto.print( separador + x );
        }
    }
}
