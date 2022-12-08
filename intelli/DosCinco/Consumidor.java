package intelli.DosCinco;

/**
 * Clase consumidor, esta clase controla si el Mostrador está lleno o no
 * en caso de no estar lleno, esperará a que el productor ponga un número
 * y notifique al consumidor.
 * @author alex
 */
public class Consumidor extends Thread{

    private Mostrador m;
    private int num;

    public Consumidor(Mostrador m){

        this.m=m;

    }

    public synchronized void run(){

        for (int i=0; i<9; i++){

            if (m.getLleno()==false) {
                System.out.println("CONSUM# EMPTY, WAITING...");
                try {
                    this.wait();
                    this.num=m.getStock();
                    System.out.println("CONSUM# WAITED AND GOT: " + this.num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                this.num=m.getStock();
                System.out.println("CONSUM# GOT: " + this.num);
                System.out.print(this.num);
            }

        }

    }
}
