

public class Caja {

    public void generarReceta(Mascota mascota) {

         mascota.revisionComentarios = "Tu mascota está en buen estado de salud, pero no estaba vacunada, se le inyecto bla bla bla.";
        System.out.println("Veterinaria dio de alta a " + mascota.nombre);
       
    }

      public void generarRecibo(Mascota mascota) {
        mascota.totalAPagar = 500;
        System.out.println("El total a pagar por la consulta de " + mascota.nombre + " es: $" + mascota.totalAPagar);
    }
}
