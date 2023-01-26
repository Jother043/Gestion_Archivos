import java.time.format.DateTimeFormatter;

public class FicherosEjecutable extends FicherosBinario implements Analizable{

    private int permisos;

    public FicherosEjecutable(String name, DateTimeFormatter date, byte[] contenido, int permisos) throws ErrorFicheroException {
        super(name, date, contenido);
        this.permisos = permisos;
    }


    @Override
    public void analizar() {
        System.out.println("Analizando: " + getName());
    }
}
