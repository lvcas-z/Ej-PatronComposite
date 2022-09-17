package PatronComposite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo {
    private String nombreCarpeta;
    private List<Archivo> archivos;

    public Carpeta(String nombreCarpeta){
        this.nombreCarpeta = nombreCarpeta;
        this.archivos = new ArrayList<>();
    }
    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }
    public void addArchivo(Archivo archivo){
        archivos.add(archivo);
    }
    public void removeArchivo(Archivo archivo){
        archivos.remove(archivo);
    }
    @Override
    public void getName() {
        for (Archivo archivo: archivos){
            archivo.getName();
        }
    }
}
