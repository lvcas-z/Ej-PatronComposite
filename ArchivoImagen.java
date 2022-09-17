package PatronComposite;

public class ArchivoImagen implements Archivo{
    private Double tamanioArchivo;
    private String nombreArchivo;

    public ArchivoImagen(Double tamanioArchivo, String nombreArchivo) {
        this.tamanioArchivo = tamanioArchivo;
        this.nombreArchivo = nombreArchivo;
    }
    public Double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(Double tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    @Override
    public void getName() {
        System.out.println(getClass().getSimpleName());
    }
}
