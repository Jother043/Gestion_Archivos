import java.time.format.DateTimeFormatter;

public class FicherosVideo extends FicherosBinario{

    private int duration;

    public FicherosVideo(String name, double size, DateTimeFormatter date, byte[] contenido, int duration) throws ErrorFicheroException {
        super(name, size, date, contenido);
        this.duration = duration;
    }
}
