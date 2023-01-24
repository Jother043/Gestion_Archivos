import java.time.format.DateTimeFormatter;

public class FicherosEjecutable extends Fichero{

    private byte[] contido;
    private int permisos;

    public FicherosEjecutable(String name, double size, DateTimeFormatter date, byte[] contido, int permisos) {
        super(name, size, date);
        this.contido = contido;
        this.permisos = permisos;
    }
}
