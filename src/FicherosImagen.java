import java.time.format.DateTimeFormatter;

public class FicherosImagen extends FicherosBinario{
    public enum Tformato{
        JPG, PNG, GIF
    }

    public FicherosImagen(String name, DateTimeFormatter date, byte[] contenido) throws ErrorFicheroException {
        super(name, date, contenido);
    }
}
