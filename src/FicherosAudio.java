import java.time.format.DateTimeFormatter;

public class FicherosAudio extends Fichero{
    private byte[] contenido;
    int seconds;

    public FicherosAudio(String name, double size, DateTimeFormatter date, byte[] contenido, int seconds) {
        super(name, size, date);
        this.contenido = contenido;
        this.seconds = seconds;
    }
}
