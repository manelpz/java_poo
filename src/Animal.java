

public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String especie;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public void mostrarDatosBasicos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
    }
}
