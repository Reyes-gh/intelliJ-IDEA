package intelli.DosDos;

import java.util.Arrays;

/**
 * Esta clase instancia tres objetos de tipo JugadorDado, luego los ejecuta y mediante .join() espera a que acabe
 * cada uno, tras esto, almacena los números de los dados sacados por cada jugador en un array, lo ordena y
 * mediante if else muestra al ganador.
 * @author alex
 */
public class mainDados {

    public static void main(String[] args) throws InterruptedException {

        //Instanciamos 3 jugadores con nombre cualquiera.
        JugadorDado j1 = new JugadorDado("Jose");
        JugadorDado j2 = new JugadorDado("Pepe");
        JugadorDado j3 = new JugadorDado("Susana");

        //Inicializamos el array de Int(s) para almacenar los dados de cada jugador
        int[] numeros = new int[3];

        j1.start();

        numeros[0] = j1.getNumDado();

        j1.join();
        j2.start();

        numeros[1] = j2.getNumDado();

        j2.join();
        j3.start();

        numeros[2] = j3.getNumDado();

        j3.join();

       /*
         Calculamos el nombre del jugador con la puntuación más alta.
         Para ello, vamos a ordenar el array, y mediante un if comprobamos que no haya habido empate.
        */
        Arrays.sort(numeros);

        if (numeros[2] == numeros[1]) {
            System.out.println("\nHa habido empate");
        } else {
                if (numeros[2] == j1.getNumDado()) {
                    System.out.println("\nEl ganador es " + j1.getNombre());
                } else if (numeros[2] == j2.getNumDado()) {
                    System.out.println("\nEl ganador es " + j2.getNombre());
                } else {
                    System.out.println("\nEl ganador es " + j3.getNombre());
                }
        }

        //Ignorando si ha habido empate o no, declaramos el juego como terminado, además de mostrar
        //las puntuaciones.
        System.out.println("Puntuacion total: " + (numeros[0]+numeros[1]+numeros[2]));
        System.out.println("El juego ha terminado");

    }
}
