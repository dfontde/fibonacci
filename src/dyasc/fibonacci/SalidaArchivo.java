package dyasc.fibonacci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SalidaArchivo extends SalidaTexto {

    public SalidaArchivo(String nombreArchivo) throws FileNotFoundException {
         super( new PrintStream( new File(nombreArchivo) ) );
    }
}
