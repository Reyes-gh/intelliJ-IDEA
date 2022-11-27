package intelli.DosCuatro;
/**
 * Clase main en la que se instanciará la clase contador y los múltiples hilos
 * @author alex
 *
 */
public class main {

	public static void main(String[] args){
		
	
		Cont contador = new Cont(0);

			hiloCont h1 = new hiloCont("c1", contador);
			hiloCont h2 = new hiloCont("c2", contador);		
			hiloCont h3 = new hiloCont("c3", contador);		
			hiloCont h4 = new hiloCont("c4", contador);		
			hiloCont h5 = new hiloCont("c5", contador);
			
			h1.start();
	
			h2.start();
		
			h3.start();
		
			h4.start();
	
			h5.start();
			
		

	}

}
