package intelli.DosCuatro;
/**
 * la clase hilo contiene un contador y de manera sincronizada le agrega valor
 * @author alex
 *
 */
public class hiloCont extends Thread{

	private Cont contador;

	public hiloCont(String n, Cont c) {
		setName(n);
		contador = c;
	}

	public void run() {
		//Aquí empieza la sincronización
		synchronized(contador) {
			for(int i=0; i<1000; i++) {
		contador.mas();
			}
		
			try {
				sleep(200);
			} catch (InterruptedException e) {}
		System.out.println("Contador " + this.getName() + " Valor: " + this.contador.getValor());
		//Aquí acaba la sincronización
		}
		
	}
	
}

