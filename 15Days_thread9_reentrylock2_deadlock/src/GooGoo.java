import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 스레드가 공유하는 데이터
public class GooGoo {
	private int num;
	Lock lock = new ReentrantLock();

	public void up(String name) throws Exception {
		lock.lock();
		boolean hasLock = false;
	/*	try {
			hasLock = lock.tryLock(3000, TimeUnit.SECONDS);// 3초 동안
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (!hasLock) {
			throw new Exception("UpThread lock 획득 실패 ");
		}
		*/
		System.out.println(name + " " + num);
		num++;
		System.out.println(num + " 이 1 증가 ");
		lock.unlock();
	}

	public void down(String name) throws Exception {
		lock.lock();
		boolean hasLock = false;
		try {
			hasLock = lock.tryLock(3000, TimeUnit.MILLISECONDS);// 3초 동안
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (!hasLock) {
			throw new Exception("UpThread lock 획득 실패 ");
		}
		System.out.println(name + " " + num);
		num--;
		System.out.println(num + " 이 1  감소 ");
		lock.unlock();
	}
}
