import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.BoardDAO;
import com.service.BoardService;

public class BoardTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:Board.xml");

		BoardService service = ctx.getBean("boardService", BoardService.class);
		// dao.getData();
		Iterator<String> ite = service.getDao().getData().iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
