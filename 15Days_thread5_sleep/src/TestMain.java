
public class TestMain {

	public static void main(String[] args) {
		
		GooGoo gg= new GooGoo(0);
		Thread t= new Thread(new GooGoo(2));
		Thread t1= new Thread(new GooGoo(3));
		Thread t2= new Thread(new GooGoo(4));
		Thread t3= new Thread(new GooGoo(5));
		Thread t4= new Thread(new GooGoo(6));
		
		Thread t5= new Thread(new GooGoo(7));
		Thread t6= new Thread(new GooGoo(8));
		Thread t7= new Thread(new GooGoo(9));
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		
		System.out.println("끝 ");
		
	}
}
