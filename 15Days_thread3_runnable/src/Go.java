
public class Go implements Runnable{
	int count=0;
	public synchronized void  run() {
		while (true) {
			count++;
			System.out.println(Thread.currentThread().getName());
			System.out.println("go = "+count);
		}
	
	}
	
}
