import java.util.UUID;

public class Registro {

      

    public void registrar(Mascota mascota) {

        

        System.out.println("La mascota ya se registró." + mascota.getNombre() + " es un " + mascota.getEspecie() + " de " + mascota.getEdad() + " años.");
        System.out.println("Se registró correctamente tu mascota.");
        asignarId(mascota);
        System.out.println("ID asignado: " + getId(mascota));
    }

     public void asignarId(Mascota mascota) {
        mascota.id = UUID.randomUUID().toString();
    }

      public String getId(Mascota mascota) {
        return mascota.id;
    }
}
