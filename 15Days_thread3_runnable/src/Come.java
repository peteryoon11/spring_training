// 1. extends Thread
// 2. public void run(){} overing
public class Come implements Runnable{
	int count=0;
	
	public void run() {
		while (true) {
			count++;
			System.out.println(Thread.currentThread().getName());
			System.out.println("come = "+count);
		}
	
	}
	
}
