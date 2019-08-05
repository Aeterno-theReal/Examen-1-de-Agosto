
public class Examen1Agosto {
	
	//Ejercicio 4
	/*
	/*
	/*
	*/

/*	public static void main(String[] args) throws InterruptedException
	{
		Runnable x=new Runnable()
		{
			@Override
			public void run() {
				String n=Thread.currentThread().getName();
				System.out.println(n + ": Acabado");
			}
		};
		Thread hilos[]=new Thread[5];
		for(int i=0; i<hilos.length; i++)
		{
			hilos[i]=new Thread(x);
			hilos[i].run();
			//hilos[i].join();
		}
		
		for(Thread hilo:hilos)
		{
			hilo.join();
		}
		
		System.out.println("main: Acabado");
	}*/
	
	//=====================================================================
	
	
	
	
	//Ejercicio 5
	/*
	/*
	/*
	*/
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread[] hilos=new Thread[5];
		
		for(int i=0; i<hilos.length; i++)
		{
			MiRunnable mr=new MiRunnable((i+1)*100);
			hilos[i]=new Thread(mr);
			hilos[i].start();
		}
		
		for(Thread hilo:hilos)
		{
			try {
				hilo.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Acaba el: " + Thread.currentThread().getName());
	}
}

	