package intelli.DosTres;

public class hiloChosen extends Thread{


    public hiloChosen(String n){
        setName(n);
    }

    public void run(){
        System.out.println("Hola, soy el hilo: " + getName());

    if(this.getName().equals("Dos")){
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    } else {for (int i=0; i<10; i++){
        try {Thread.sleep(4000);} catch (InterruptedException e) {}
    }
    }}


    public Thread.State getStatus() {
        return this.getState();
    }

}
