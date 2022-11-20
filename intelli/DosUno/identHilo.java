package intelli.DosUno;

/**
 * Esta clase implementa Runnable, y muestra el identificador del hilo.
 * @author alex
 */
public class identHilo implements Runnable{


    @Override
    public void run() {
        try {

        Thread.sleep(Thread.currentThread().getId()*500);

        System.out.println(Thread.currentThread().getName());
        System.out.println("Hola mundo!");

        System.out.println("La id de este thread es " + Thread.currentThread().getId() + "\n");



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
