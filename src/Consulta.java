
public class Consulta {

    public void revisar(Mascota mascota) {
        serVacunado(mascota);
        serDesparasitado(mascota);
        System.out.println("Veterinario terminó de revisar a tu mascota " + mascota.nombre);
    }


}
