import java.util.ArrayList;
import java.util.List;

public class Carrera {

    public static void main(String[] args) {
        // --- Preparación de objetos compartidos ---
        PuestoAvituallamiento puesto = new PuestoAvituallamiento();
        Podio podio = new Podio(); // TAREA 4.4: Crea la instancia del Podio.

        List<Thread> corredores = new ArrayList<>();

        // TAREA 1.2: Crea los corredores y los hilos. Asegúrate de pasar
        //            la instancia del Podio a cada corredor.
        
        // --- INICIA TU CÓDIGO AQUÍ (Creación de corredores y hilos) ---
        

        
        
        System.out.println("¡Suena el pistoletazo de salida!");
        
        // TAREA 1.3: Inicia todos los hilos.
        // --- INICIA TU CÓDIGO AQUÍ ---

        for (Thread corredor : corredores) {
            corredor.start();
        }

        

        // TAREA 2.1: Espera a que todos los hilos terminen usando join().
        // --- INICIA TU CÓDIGO AQUÍ ---

        for (Thread corredor : corredores) {
            try {
                corredor.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        
        System.out.println("\n¡¡¡LA CARRERA HA TERMINADO!!!");

        // TAREA 4.5: Obtén el ganador del podio e imprímelo por pantalla.
        // --- INICIA TU CÓDIGO AQUÍ ---

        String ganador = podio.getGanador();
        System.out.println("=============================================");
        System.out.println("El ganador de la carrera es: " + ganador );
        System.out.println("=============================================");

        // --- TERMINA TU CÓDIGO AQUÍ ---
    }
}
