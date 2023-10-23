public class Main {

    public static void main(String[] args) {
        Main carrera = new Main();
        carrera.iniciarCarrera();
    }


    public void iniciarCarrera() {
        //instanciamos los hilos
        Thread liebre = new liebre();
        Thread tortuga = new tortuga();
        Thread caballo = new caballo();
        Thread perro = new perro();

        // Asignar prioridades a los hilos
        liebre.setPriority(9);
        tortuga.setPriority(2);
        caballo.setPriority(7);
        perro.setPriority(6);

        //iniciamos los hilos
        liebre.start();
        tortuga.start();
        caballo.start();
        perro.start();

        //esperamos a que los hilos terminan
        try{
            liebre.join();
            tortuga.join();
            caballo.join();
            perro.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}





