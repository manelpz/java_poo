
public class Consulta {

    public void revisar(Mascota mascota) {
        serVacunado(mascota);
        serDesparasitado(mascota);
        System.out.println("Veterinario terminó de revisar a tu mascota " + mascota.nombre);
    }

        public void serVacunado(Mascota mascota) {
        mascota.vacunado = true;
        System.out.println(mascota.nombre + " fue vacunado");
    }

    public void serDesparasitado(Mascota mascota) {
        mascota.desparasitado = true;
        System.out.println(mascota.nombre + " fue desparasitado");
    }
}
