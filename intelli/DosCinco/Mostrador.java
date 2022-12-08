package intelli.DosCinco;

/**
 * Clase mostrador, esta clase posee una propiedad que indica si está lleno
 * o no, también posee un número donde se almacenarán los números que pone
 * el Productor y que el Consumidor recoge.
 *
 * @author alex
 */
public class Mostrador {

    private boolean lleno;
    private int numStock;

    public Mostrador() {

        this.lleno = false;
        this.numStock = 0;

    }

    public void setStock(int s) {
        this.lleno=true;
        this.numStock=s;
    }

    public boolean getLleno(){
        return this.lleno;
    }

    public int getStock(){
        this.lleno=false;
        return this.numStock;
    }

}
