/**
 * FASE 4: Coordinación con wait() y notifyAll()
 *
 * Esta clase representa al juez que da la señal de inicio. Su misión es asegurar
 * que todos los corredores comiencen la carrera al mismo tiempo, resolviendo el
 * problema de la "salida justa".
 */
public class JuezSalida {

    // Esta variable de estado controla si la carrera puede empezar.
    // Inicialmente es 'false' para que los corredores tengan que esperar.
    private boolean listosParaEmpezar = false;

    /**
     * TAREA 4.1: Completa este método para que un corredor espere.
     *
     * Este método es llamado por cada corredor al inicio de su ejecución.
     * Debe hacer que el hilo se bloquee y espere hasta que el método 'darSalida()' sea invocado.
     *
     * PASOS A SEGUIR:
     * 1. Añade la palabra clave 'synchronized' a la firma del método.
     *    (Recordatorio: wait() solo puede llamarse desde un bloque o método sincronizado).
     *
     * 2. Escribe un bucle 'while' que se ejecute mientras 'listosParaEmpezar' sea 'false'.
     *    (Usamos 'while' en lugar de 'if' como buena práctica contra "despertares espurios").
     *
     * 3. Dentro del bucle, llama al método 'wait()'. Esto liberará el monitor y pondrá
     *    al hilo en estado de espera.
     *
     * 4. Envuelve la llamada a 'wait()' en un bloque 'try-catch' para manejar la
     *    'InterruptedException', que es obligatoria.
     */
    public void esperarSalida() {
        // --- INICIA TU CÓDIGO AQUÍ ---


        // --- TERMINA TU CÓDIGO AQUÍ ---
    }

    /**
     * TAREA 4.2: Completa este método para dar la señal de inicio.
     *
     * Este método es llamado por el hilo principal ('main') para despertar a todos
     * los corredores que están esperando.
     *
     * PASOS A SEGUIR:
     * 1. Añade la palabra clave 'synchronized' a la firma del método.
     *
     * 2. Cambia el valor de la variable 'listosParaEmpezar' a 'true'.
     *
     * 3. Llama al método 'notifyAll()' para despertar a TODOS los hilos que
     *    estaban esperando en el monitor de este objeto.
     */
    public void darSalida() {
        // --- INICIA TU CÓDIGO AQUÍ ---


        // --- TERMINA TU CÓDIGO AQUÍ ---
    }
}