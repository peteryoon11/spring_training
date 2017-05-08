
public class TestMain {

	public static void main(String[] args) {
		GooGoo gogo= new GooGoo();
	UpThread ut=new  UpThread(gogo, "UpThread");
	DownThread dt= new DownThread(gogo, "DownThread");
		ut.start();
		dt.start();
	}
}
