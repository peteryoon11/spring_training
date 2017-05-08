
public class GooGoo implements Runnable {
	private int dan;

	public GooGoo(int dan) {
		this.dan = dan;
	}

	public void run() {
	
		if(dan==8)
		{
			System.out.println(dan+ " 단이 yield");
			Thread.yield();
		}
		
		for(int i=1;i<10;i++)
		{
			System.out.println(dan +" * "+ i +" = "+ dan*i);
		}
	}
}
