import java.time.format.DateTimeFormatter;

public class FicherosVideo extends FicherosBinario implements Reproducible {

    private int duration;

    public FicherosVideo(String name, DateTimeFormatter date, byte[] contenido, int duration) throws ErrorFicheroException {
        super(name, date, contenido);
        this.duration = duration;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getName());
    }
}
