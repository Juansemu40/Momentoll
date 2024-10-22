public class Foto {

    private String carpeta;

    public Foto(String carpeta) {
        this.carpeta = carpeta;
    }

    public void mostrar() {
        System.out.println("Imprimiendo foto: " + carpeta);
    }

    public String getFichero() {
        return carpeta;
    }
}
