
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        Fichero[] ficheroes = new Fichero[0];
        try {
            ficheroes = new Fichero[]{
                    new FicherosTextoPlano("file1.txt", fecha, new String[]{"hola", "prueba"}),
                    new FicherosTextoPlano("file1.txt", fecha, new String[]{"hola", "prueba"}),
                    new FicherosTextoPlano("file1.txt", fecha, new String[]{"hola", "prueba"})
            };
        } catch (ErrorFicheroException e) {
            System.err.println("Error al crear el fichero.");
        }

        for (Fichero f: ficheroes) {
            if(f instanceof Analizable){
                ((Analizable) f).analizar();
            }
            if(f instanceof Leible){
                ((Leible) f).conversoresDeTexroAudio();
            }
            if(f instanceof Representable){
                ((Representable) f).representar();
            }
            if(f instanceof Reproducible){
                ((Reproducible) f).reproducir();
            }
        }
    }
}
