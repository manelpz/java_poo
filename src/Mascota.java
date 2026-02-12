import java.util.UUID;

public class Mascota extends Animal {

  public String id;

    public boolean vacunado;
    public boolean desparasitado;
    public String revisionComentarios;
    public int totalAPagar;

    public Mascota(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
        this.vacunado = false;
        this.desparasitado = false;
        this.revisionComentarios = "";
    }

   

  

    public String getNombre() {
        return nombre;
    }

     public String getEspecie() {
        return especie;
    }

     public int getEdad() {
        return edad;
    }



    public void mostrarInfoCompleta() {
        System.out.println("-----Info Completa ---------------------");
        System.out.println("ID: " + id);
        mostrarDatosBasicos();
        System.out.println("Vacunado: " + vacunado);
        System.out.println("Desparasitado: " + desparasitado);
        System.out.println("revision comentarios: " + revisionComentarios);
         System.out.println("Total a pagar: " + totalAPagar);
        System.out.println("--------------------------");
    }
}
