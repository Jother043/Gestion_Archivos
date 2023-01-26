import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class FicherosTextoPlano extends FicherosTexto implements Representable{

    public FicherosTextoPlano(String name, DateTimeFormatter date, String[] contenido) throws ErrorFicheroException {
        super(name, date, contenido);
    }

    @Override
    public void representar() {
        System.out.println("name : " + getName());
        System.out.println("size : " + getSize());
        System.out.println("date : " + getDate());
        System.out.println("contenido : " + Arrays.toString(getContenido()));
    }
}
