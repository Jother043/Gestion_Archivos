import java.time.format.DateTimeFormatter;

public abstract class FicherosBinario extends Fichero{

    private byte[] contenido;

    public FicherosBinario(String name, DateTimeFormatter date, byte[] contenido) throws ErrorFicheroException {
        super(name,contenido.length, date);
        this.contenido = new byte[2];
    }


}
