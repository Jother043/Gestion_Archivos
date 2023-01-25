import java.time.format.DateTimeFormatter;

public class FicherosEjecutable extends FicherosBinario{

    private int permisos;

    public FicherosEjecutable(String name, double size, DateTimeFormatter date, byte[] contenido, int permisos) throws ErrorFicheroException {
        super(name, size, date, contenido);
        this.permisos = permisos;
    }
}
