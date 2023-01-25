import java.time.format.DateTimeFormatter;

public class FicherosTexto extends Fichero implements Leible {

    private String[] contenido;

    public FicherosTexto(String name, double size, DateTimeFormatter date, String[] contenido) throws ErrorFicheroException {
        super(name, size, date);
        contenido = new String[30];
    }

    public String[] getContenido() {
        return contenido;
    }

    @Override
    public String conversoresDeTexroAudio(String[] contenido, String texto) {
        for (int i = 0; i < contenido.length; i++){
            if(contenido[i] != null){
                contenido[i] = texto;
            }
        }

        return null;
    }

}
