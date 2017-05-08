// 스레드가 공유하는 데이터
public class GooGoo {
	private int num;

	public synchronized void up(String name) {
		System.out.println(name + " "+num);
		num++;
		System.out.println(num+ " 이 1 증가 ");
	}

	public synchronized void down(String name) {
		System.out.println(name + " "+num);
		num--;
		System.out.println(num+ " 이 1  감소 ");
	}
}
