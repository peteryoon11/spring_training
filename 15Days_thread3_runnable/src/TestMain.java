
public class TestMain {

	public static void main(String[] args) {
		Go g = new Go();
	
		Come come = new Come();
		
		Thread t= new Thread(g);
		Thread t1=new Thread(come);
		t.setPriority(10);
		t.start();
		t1.start();
		//t1.set
		/*g.start();
	
		come.start();
	*//*	while (true) {
			g.run();
			try {
				g.wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			come.run();
		}*/
	}
}
