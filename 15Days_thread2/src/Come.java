// 1. extends Thread
// 2. public void run(){} overing
public class Come extends Thread{
	int count;
	
	public void run() {
		while (true) {
			count++;
			System.out.println("come = "+count);
		}
	
	}
	
}
