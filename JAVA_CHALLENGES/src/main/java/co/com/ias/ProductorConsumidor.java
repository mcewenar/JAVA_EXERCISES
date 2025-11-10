package co.com.ias;

//-----------------------------------------------------------------------
import java.util.Random;//Importa la clase Random, que se usará para generar tiempos de espera aleatorios.
//---------------------------------------------------------------------------

public class ProductorConsumidor { //Aquí se define la clase principal llamada ProductorConsumidor

    // Clase Limpiar
    static class Limpiar { //es una clase estática interna que gestiona el estado de producción y consumo.
        private boolean vacio = true; // Se inicializa como true, lo que indica que el buffer está vacío.

        public synchronized boolean isVacio() { //Método sincronizado que devuelve el estado de la variable vacio. La sincronización 
        	                                      //asegura que solo un hilo puede acceder a este método a la vez.
            return vacio;
        }

        public synchronized void setVacio(boolean vacio) {  //Método sincronizado que establece el estado de vacio y notifica a
        	                                                //todos los hilos que están esperando. Esto permite que otros hilos
        	                                                 //puedan reanudar su ejecución si están bloqueados.
        	
        	
        	
            this.vacio = vacio;
            notifyAll(); // Notifica a los hilos en espera.
        }
    }
//------------------------------------------------------------------------------
    // Clase Generar (Productor)
    static class Generar implements Runnable {
        private Limpiar limpiar;// Referencia a la instancia de Limpiar que se usa para controlar el estado de producción.

        public Generar(Limpiar limpiar) { //  Constructor que inicializa la variable limpiar con la instancia pasada 
        	                              //al crear el hilo productor.
            this.limpiar = limpiar;
        }

        @Override
        public void run() {  //Este método contiene la lógica del hilo. Se crea un objeto 
        	                   //Random para generar tiempos de espera aleatorios.
            Random rand = new Random();
            for (int i = 0; i < 10; i++) { // Se ejecuta 10 veces, simulando la producción de 10 productos.
                try {
                    Thread.sleep(rand.nextInt(1000)); // Se duerme el hilo durante un tiempo aleatorio entre 0 y 1000 milisegundos 
                                                       //para simular el tiempo que toma producir un producto.
                    limpiar.setVacio(false); // Se establece vacio en false para indicar que hay un producto disponible y se imprime 
                                             //el mensaje de producción.
                    System.out.println("Producto generado: " + (i + 1));
                    Thread.sleep(500); // Se duerme el hilo por 500 milisegundos para simular el tiempo entre producciones. El bloque try-catch 
                                       //maneja posibles interrupciones del hilo.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            limpiar.setVacio(true); // Después del bucle, se establece vacio en true para indicar que ya no 
                                    //se producirán más productos, y se imprime un mensaje.
            System.out.println("Producción finalizada.");
        }
    }
    
    //-------------------------------------------------------------------------------

    // Clase Consumir (Consumidor)
    static class Consumir implements Runnable { //Similar a la clase Generar, esta clase implementa Runnable y tiene una referencia
    	                                         //a la instancia de Limpiar.
        private Limpiar limpiar;

        public Consumir(Limpiar limpiar) {//Inicializa la variable limpiar con la instancia proporcionada.
            this.limpiar = limpiar;
        }

        @Override
        public void run() {//Contiene la lógica del hilo consumidor que se ejecuta indefinidamente en un bucle while (true).
            while (true) {
                synchronized (limpiar) { //Contiene la lógica del hilo consumidor que se ejecuta indefinidamente en un bucle while (true).
                    try {
                        while (limpiar.isVacio()) { //Si vacio es true, el hilo consumidor espera. Cuando el productor establece vacio en false,
                        	                           //el hilo consumidor puede continuar.
                            limpiar.wait(); // Espera hasta que el buffer no esté vacío
                        }
                        // Consumir el producto
                        System.out.println("Producto consumido.");  //Cuando hay un producto disponible, el consumidor imprime el mensaje de consumo y establece 
                                                                    //vacio en true para indicar que ha consumido el producto.
                        limpiar.setVacio(true); // Cambia el estado a vacío
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
//---------------------------------------------------------------------------------------------
    public static void main(String[] args) {//Cuando hay un producto disponible, el consumidor imprime el mensaje de consumo y 
    	                                      //establece vacio en true para indicar que ha consumido el producto.
        Limpiar limpiar = new Limpiar();
        Thread productor = new Thread(new Generar(limpiar));  //crean dos hilos, uno para el productor y otro para el consumidor, 
                                                              //pasando la misma instancia de Limpiar.
        Thread consumidor = new Thread(new Consumir(limpiar));

        productor.start(); //Se inician ambos hilos, lo que permite que comiencen a ejecutar sus métodos run.
        consumidor.start();
    }
}