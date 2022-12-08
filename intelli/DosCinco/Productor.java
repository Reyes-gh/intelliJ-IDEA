package intelli.DosCinco;

/**
 * Clase productor, esta clase genera números de manera aleatoria y cada vez
 * que lo hace notifica al Consumidor, en caso de detectar que el mostrador está
 * lleno no hará nada.
 * @author alex
 */
public class Productor extends Thread{

    private int num;
    private Mostrador m;
    private Consumidor c;
    public Productor(Mostrador m, Consumidor c){
        this.m=m;
        this.c=c;
    }

    public synchronized void run(){

        for (int i = 0 ; i<9; i++) {
            if (m.getLleno()==true) {

                System.out.println("PROD# Mostrador lleno... no se pondrán números");

            } else{

                this.num=(int)(Math.random()*10);
                m.setStock(this.num);
                System.out.println("PROD# PUT: " + this.num);

                synchronized (c){
                    c.notify();
                }

            }
        }


    };

}
