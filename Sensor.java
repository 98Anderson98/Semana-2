package Semana2;

public class Sensor {
	// Constructor
    public Sensor() {
        System.out.println("Sensor activado");
    }

    // Método finalize() para simular el destructor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Sensor desactivado");
        super.finalize();
    }
    
    public static void main(String[] args) {
        
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

       
        sensor1 = null;
        sensor2 = null;
        System.gc(); // Llamar al recolector de basura

      
        try {
            Thread.sleep(1000); // Pausa de 1 segundo
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
