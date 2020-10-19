package dyasc.fibonacci;

import java.io.*;
import java.util.*;

public class Opciones {
    private int n;
    Salida salida;

    private static Map<String, AplicarOpcion> disponibles = new LinkedHashMap<>();
    static{
        disponibles.put("f", (salida, detalle) -> new SalidaArchivo(detalle) );
        disponibles.put("i", (salida, detalle) -> new SalidaInversa( salida ));
        disponibles.put("m", (salida, detalle) -> detalle.equals("s") ? new SalidaSumatoria(salida) : salida);
        disponibles.put("v", (salida, detalle) -> salida.separador( "\n" ) );
        disponibles.put("h", (salida, detalle) -> salida.separador( SalidaTexto.ESPACIO ) );
        disponibles.put("d", (salida, detalle) -> salida);
    }

    public Opciones( String[] args ) throws IOException {
        salida = new SalidaPantalla(this);
        n = Integer.parseInt( args[posicionDeN(args)] );
        Map<String,String> recibidas = interpretarOpcionesRecibidas(args);
        for( String codigo : disponibles.keySet() ) {
            procesarRecibidas( recibidas, codigo );
        }
        if ( recibidas.size() != 0 ){
            throw new IllegalArgumentException("Opcion no válida");
        }
    }

    /** Porque el siguiente argumento es n */
    private int posicionDeN(String[] args) {
        return args.length - 1;
    }

    private void procesarRecibidas(Map<String,String> recibidas, String codigo ) throws IOException{
        if ( recibidas.containsKey( codigo ) ) {
            String detalle = recibidas.get( codigo );
            salida = disponibles.get(codigo).aplicar(salida, detalle);
            recibidas.remove(codigo);
        }
    }

    private Map<String,String> interpretarOpcionesRecibidas(String[] args) {
        Map<String,String> tabuladas = new HashMap<>();
        for (int i = 0; i < posicionDeN(args); i++ ){
            Opcion opcion = new Opcion( args[i] );
            if ( "o".equals(opcion.codigo()) ){
                tabuladas.put( opcion.detalle().substring(0,1), "" );
                tabuladas.put( opcion.detalle().substring(1,2), "" );
            }
            else{
                tabuladas.put( opcion.codigo(), opcion.detalle() );
            }
        }
        return tabuladas;
    }

    public Salida salida(){
        return this.salida;
    }

    public int n() {
        return n;
    }
}