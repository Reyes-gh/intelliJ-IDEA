package intelli.DosCinco;

public class Main {

    public static void main(String[] args) {

        Mostrador m1 = new Mostrador();
        
        Consumidor c1 = new Consumidor(m1);
        Productor p1 = new Productor(m1, c1);

        //Una vez instanciados, empezamos los hilos
            c1.start();
            p1.start();

    }

}
