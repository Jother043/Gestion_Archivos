import java.time.format.DateTimeFormatter;

public class FicherosTextoFormateado extends FicherosTexto{

    public enum Tfont{
        ARIAL, CALIBRI, COMIC_SANS
    }

    private int sizeFont;
    private String colorFont;

    public FicherosTextoFormateado(String name, DateTimeFormatter date, String[] contenido, int sizeFont, String colorFont) throws ErrorFicheroException {
        super(name, date, contenido);
        this.sizeFont = sizeFont;
        this.colorFont = colorFont;
    }
}
