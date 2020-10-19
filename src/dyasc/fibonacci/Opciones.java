package dyasc.fibonacci;

import java.util.Collections;
import java.util.List;

public class Opciones {
    public static final char HORIZONTAL = 'h';
    public static final char VERTICAL = 'v';
    public static final char DIRECTA = 'd';
    public static final char INVERSA = 'i';
    private char orientación = HORIZONTAL;
    private char dirección = DIRECTA;
    private boolean explícitas = false;

    public Opciones( String[] args ) {
        String arg = args[0];
        if (arg.startsWith("-o=")) {
            orientación = arg.charAt(3);
            dirección = arg.charAt(4);
            explícitas = true;
        }
    }

    boolean validas() {
        return (horizontal() || vertical()) && (directa() || inversa());
    }

    boolean explícitas() { return explícitas; }

    private boolean horizontal() { return orientación == HORIZONTAL; }

    private boolean vertical() { return orientación == VERTICAL; }

    private boolean directa() { return dirección == DIRECTA; }

    private boolean inversa() { return dirección == INVERSA; }

    void ajustarDirección(List<Integer> secuenciaFibonacci) {
        if (inversa()){
            Collections.reverse(secuenciaFibonacci);
        }
    }

    String separador() {
        return horizontal() ? " " : "\n";
    }
}