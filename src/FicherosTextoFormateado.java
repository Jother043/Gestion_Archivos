import java.time.format.DateTimeFormatter;

public class FicherosTextoFormateado extends FicherosTexto{

    public enum Tfont{
        ARIAL, CALIBRI, COMIC_SANS
    }

    private int sizeFont;
    private String colorFont;

    public FicherosTextoFormateado(String name, double size, DateTimeFormatter date, String[] contenido, int sizeFont, String colorFont) {
        super(name, size, date, contenido);
        this.sizeFont = sizeFont;
        this.colorFont = colorFont;
    }
}
