public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void iniciarCarrera(){
        //instanciamos los hilos
        Thread liebre=new liebre();
        Thread tortuga=new tortuga();
        Thread caballo=new caballo();
        Thread perro=new perro();

        liebre.setPriority();
        tortuga.setPriority();
        caballo.setPriority();
        perro.setPriority();

    }
}





