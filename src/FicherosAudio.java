import java.time.format.DateTimeFormatter;

public class FicherosAudio extends FicherosBinario{
    int seconds;

    public FicherosAudio(String name, double size, DateTimeFormatter date, byte[] contenido, int seconds) throws ErrorFicheroException {
        super(name, size, date, contenido);
        this.seconds = seconds;
    }
}
