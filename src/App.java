


public class App {
    public static void main(String[] args) throws Exception {
        
        Mascota mascota = new Mascota("firulais", 3, "perro");

        Registro registro = new Registro();
        Consulta consulta = new Consulta();
        Caja farmacia = new Caja();

        mascota.mostrarInfoCompleta();

        registro.registrar(mascota);
        mascota.mostrarInfoCompleta();

        consulta.revisar(mascota);
        mascota.mostrarInfoCompleta();

        farmacia.generarReceta(mascota);
        farmacia.generarRecibo(mascota);
        mascota.mostrarInfoCompleta();
        
    }
}
