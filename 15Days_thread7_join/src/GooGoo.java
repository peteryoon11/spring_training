
public class GooGoo implements Runnable {
	private int dan;

	public GooGoo(int dan) {
		this.dan = dan;
	}

	public synchronized void run() {
	
		long time = (long) (Math.random() * 500);
		System.out.println(dan + " 단이 " + time + " 만큼 sleep");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<10;i++)
		{
			System.out.println(dan +" * "+ i +" = "+ dan*i);
		}
	}
}
