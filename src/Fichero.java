import java.time.format.DateTimeFormatter;

public abstract class Fichero{

    private String name;
    private long size;
    private DateTimeFormatter date;

    public Fichero(String name, long size, DateTimeFormatter date) throws ErrorFicheroException {
        this.setName(name);
        this.setSize(size);
        this.date = date;
    }

    private void setSize(long size) throws ErrorFicheroException {
        if(size <= 0){
            throw new ErrorFicheroException("El fichero no puede dar un tamaño igual a cero o inferior. ");
        }
        this.size = size;
    }

    private void setName(String name) throws ErrorFicheroException {
        if (name == null || name.trim().isEmpty()){
            throw new ErrorFicheroException("Error el nombre del fichero no es valido. ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public DateTimeFormatter getDate() {
        return date;
    }

    public final void information() {
        System.out.println("Fichero");
        System.out.println("1. tamaño Fichero: " + getSize());
        System.out.println("2. nombre: " + getName());
        System.out.println("3. fecha: " + this.date);
    }
}
