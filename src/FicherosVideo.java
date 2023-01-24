import java.time.format.DateTimeFormatter;

public class FicherosVideo extends Fichero{

    private byte[] contenido;
    private int duration;

    public FicherosVideo(String name, double size, DateTimeFormatter date, byte[] contenido, int duration) {
        super(name, size, date);
        this.contenido = contenido;
        this.duration = duration;
    }
}
