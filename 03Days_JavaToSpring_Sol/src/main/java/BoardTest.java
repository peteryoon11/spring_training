import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.BoardService;

public class BoardTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:Board.xml");
		BoardService service=ctx.getBean("boardService",BoardService.class);
		List<String> list=service.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
