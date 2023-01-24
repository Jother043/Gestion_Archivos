import java.time.format.DateTimeFormatter;

public class FicherosBinario extends Fichero{

    private byte[] contenido;

    public FicherosBinario(String name, double size, DateTimeFormatter date, byte[] contenido) {
        super(name, size, date);
        this.contenido = contenido;
    }
}
