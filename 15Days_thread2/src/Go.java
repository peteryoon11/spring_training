
public class Go extends Thread{
	int count;
	public void run() {
		while (true) {
			count++;
			System.out.println("go = "+count);
		}
	
	}
	
}
