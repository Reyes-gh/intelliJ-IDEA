package intelli.DosTres;

public class main {

    public static void main(String[] args) throws InterruptedException {

    hiloChosen h1 = new hiloChosen("Uno");
    hiloChosen h2 = new hiloChosen("Dos");
    hiloChosen h3 = new hiloChosen("Tres");
    hiloChosen h4 = new hiloChosen("Cuatro");
    h1.start();
    h1.sleep(1000);

        System.out.println("Status hilo 1: " + h1.getStatus());

        synchronized (h2){
            h2.start();
            System.out.println("Status hilo 2: " + h2.getStatus());
            System.out.println("Despertamos al hilo 2;");
            Thread.sleep(1000);
            h2.notifyAll();
            System.out.println("Vemos su status:" + h2.getStatus());

    }
        h3.start();

        System.out.println("Status hilo 3: " + h3.getStatus());

        h4.join();
        System.out.println("Status hilo 4: " + h4.getStatus());
        h4.start();




    }
}
