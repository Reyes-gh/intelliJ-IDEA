package intelli.DosUno;

public class mainHilos {

    public static void main(String[] args) {

        identHilo h1 = new identHilo();
        identHilo h2 = new identHilo();
        identHilo h3 = new identHilo();
        identHilo h4 = new identHilo();
        identHilo h5 = new identHilo();

        Thread t1 = new Thread(h1, "Primer Hilo");
        t1.start();

        Thread t2 = new Thread(h2, "Segundo Hilo");
        t2.start();

        Thread t3 = new Thread(h3, "Tercer Hilo");
        t3.start();

        Thread t4 = new Thread(h4, "Cuarto Hilo");
        t4.start();

        Thread t5 = new Thread(h5, "Quinto Hilo");
        t5.start();

    }

}
