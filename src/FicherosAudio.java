import java.time.format.DateTimeFormatter;

public class FicherosAudio extends FicherosBinario implements Reproducible {
    int seconds;

    public FicherosAudio(String name, DateTimeFormatter date, byte[] contenido, int seconds) throws ErrorFicheroException {
        super(name, date, contenido);
        this.seconds = seconds;

    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getName());
    }
}
