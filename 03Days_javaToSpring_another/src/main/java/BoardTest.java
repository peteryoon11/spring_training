import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.BoardServcie;

public class BoardTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:board.xml");
	
		BoardServcie service = ctx.getBean("boardService", BoardServcie.class);
		
		List<String> list = service.list();
		
		for (String string : list) {
			System.out.println(string);
		//System.out.println("test");	
			
		}
		
	}
}
