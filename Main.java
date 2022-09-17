package PatronComposite;

public class Main {
    public static void main(String[] args) {
        ArchivoImagen fotoGato = new ArchivoImagen(12.3,"Fotogato.jpg");
        ArchivoTexto notasEscuela = new ArchivoTexto(12.2,"notasEscuela.jpg");
        ArchivoVideo videoGolModric = new ArchivoVideo(122.53,"videoGolModric.mpa4");
        ArchivoImagen fotoPerro = new ArchivoImagen(12.3,"fotoPerro.jpg");
        ArchivoTexto notasUni = new ArchivoTexto(12.2,"notasUni.jpg");
        ArchivoVideo videoCarrera = new ArchivoVideo(122.53,"videoCarrera.mp4");

        Carpeta carpetaRandom = new Carpeta("Carpeta Random");
        carpetaRandom.addArchivo(fotoGato);
        carpetaRandom.addArchivo(notasEscuela);
        carpetaRandom.addArchivo(videoGolModric);
        carpetaRandom.addArchivo(fotoPerro);
        carpetaRandom.addArchivo(notasUni);
        carpetaRandom.addArchivo(videoCarrera);
        System.out.println("---VISUALIZO LOS ARCHIVOS DE MI CARPETA---");
        carpetaRandom.getName();
        System.out.println("---ELIMINO LOS ARCHIVOS DE IMAGEN Y VIDEO DE MI CARPETA---");
        carpetaRandom.removeArchivo(fotoGato);
        carpetaRandom.removeArchivo(fotoPerro);
        carpetaRandom.removeArchivo(videoCarrera);
        carpetaRandom.removeArchivo(videoGolModric);
        carpetaRandom.getName();
    }
}
