package intelli.DosDos;

/**
 * Clase jugador, que tiene la función para generar el número sacado por cada uno de ellos
 * @author alex
 */
public class JugadorDado extends Thread{

    private int numDado;
    private String nameJugador;

    public JugadorDado(String nombre) {
        this.nameJugador=nombre;
        this.numDado = (int)(Math.random()*6+1);
    }

    public void run(){

        System.out.println("\nJugador: "+ this.nameJugador);

        System.out.println("Número: " + this.numDado);

    }

    public String getNombre(){
        return this.nameJugador;
    }

    public int getNumDado(){
        return this.numDado;
    }

}
