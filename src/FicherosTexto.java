import java.time.format.DateTimeFormatter;

public class FicherosTexto extends Fichero implements Representable {

    private String[] contenido;

    public FicherosTexto(String name, double size, DateTimeFormatter date, String[] contenido) throws ErrorFicheroException {
        super(name, size, date);
        this.contenido = contenido;

    }

    @Override
    public void representar() {

    }

}
