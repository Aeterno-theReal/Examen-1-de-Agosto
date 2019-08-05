
public class MiRunnable implements Runnable
{
	int tiempo;
	
	public MiRunnable(int tiempo)
	{
		this.tiempo=tiempo;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(this.tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String nombre=Thread.currentThread().getName();
		System.out.println("El hilo " + nombre + ": Acabado");
	}

}
