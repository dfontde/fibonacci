package dyasc.fibonacci;

/** Un opción modofica el comportamiento de Fibonacci.
 * Se especifican en la forma
 * -x=detalle
 * donde x es el código de 1 caracter
 * y el = y el detalle son opcionales.
 * */
public class Opcion {

    private String codigo;
    private String detalle;

    public Opcion( String arg ){
        this.codigo = arg.substring(1,2);
        this.detalle = arg.contains("=") ? arg.substring(arg.indexOf('=')+1 ) : null ;
    }

    public String codigo(){ return codigo; }

    public String detalle() { return detalle; }
}
