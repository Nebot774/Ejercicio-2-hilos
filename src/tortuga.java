import java.util.Random;

public class tortuga extends Thread{

    //definimos el contador
    static int contador=0;


    //definimos las vueltas que dara el bulce
    private  static  final int CANTIDAD_VUELTAS=1000;


    private boolean requisitoAleatorio(){
        Random random=new Random();
        return random.nextDouble()<0.10;//buscamos un 10% de probabilidad
    }

    //iniciamos el processo
    @Override
    public  void run(){

        for(int i=0;i<CANTIDAD_VUELTAS;i++) {

            contador++;

            if (requisitoAleatorio()) {
                //probam
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }


}
