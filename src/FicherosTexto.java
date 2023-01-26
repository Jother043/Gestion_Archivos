import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public abstract class FicherosTexto extends Fichero implements Leible {

    private String[] contenido;

    public FicherosTexto(String name, DateTimeFormatter date, String[] contenido) throws ErrorFicheroException {
        super(name, devolverTamaño(contenido), date);
        this.contenido = contenido;
    }

    private static int devolverTamaño(String[] contenido){
        int tamaño = 0;
        for(String c : contenido){
            tamaño += c.length();
        }
        return tamaño;
//        return Arrays.stream(contenido).reduce(String :: concat).get().length();
    }
    public String[] getContenido() {
        return contenido;
    }

    @Override
    public String conversoresDeTexroAudio() {
        StringBuilder cadenaTotal = new StringBuilder();
        for(String c : contenido){
            cadenaTotal.append(c);
        }

        return cadenaTotal.toString();
    }

}
