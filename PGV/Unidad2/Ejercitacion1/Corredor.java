import java.util.Random;

/**
 * Representa la tarea que realizará cada corredor.
 */
public class Corredor implements Runnable {

    private final String nombre;
    private final int distanciaTotal = 10;
    private final PuestoAvituallamiento puesto;
    private final Podio podio;

    public Corredor(String nombre, PuestoAvituallamiento puesto, Podio podio) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.podio = podio;
    }

    @Override
    public void run() {
        // TAREA 1.1: Completa el bucle de la carrera.
        System.out.println(nombre + " ha comenzado a correr.");

        for (int i = 1; i <= distanciaTotal; i++) {
            System.out.println("   " + nombre + " va por el metro " + i);

            try {
                //Thread.sleep() con un tiempo aleatorio (ej. entre 100 y 500 ms).
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            if (i == 5) {
                puesto.usarPuesto(this.nombre);
            }
        }
        
        System.out.println("¡¡¡ " + nombre + " ha llegado a la meta !!!");

        // TAREA 4.3: Justo después de terminar, el corredor debe registrar su
        // llegada en el podio. Llama al método correspondiente de la clase Podio.
        // --- INICIA TU CÓDIGO AQUÍ ---

        podio.registrarLlegada(this.nombre);

        // --- TERMINA TU CÓDIGO AQUÍ ---
    }
}
