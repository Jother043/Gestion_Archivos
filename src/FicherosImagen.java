import java.time.format.DateTimeFormatter;

public class FicherosImagen extends Fichero{
    private byte[] contenido;
    public enum Tformato{
        JPG, PNG, GIF
    }

    public FicherosImagen(String name, double size, DateTimeFormatter date, byte[] contenido) {
        super(name, size, date);
        this.contenido = contenido;
    }
}
