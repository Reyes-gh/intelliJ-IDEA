package intelli.DosCuatro;
/**
 * Clase contador con los métodos getValue para ver el valor y mas para agregarle valor al mismo.
 * @author alex
 *
 */
public class Cont {
	
	private int num;
	
	public Cont(int num) {
		this.num = num;
	}
	
	public void mas() {
		this.num++;
	}
	
	public int getValor() {
		return this.num;
	}

}
