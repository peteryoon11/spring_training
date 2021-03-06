import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;
import com.service.MyService;

public class BoardTest {

	public static void main(String[] args) {
/*		MyService service = new MyService();
		List<Person> list = service.listPerson();
		for (Person str : list) {
			System.out.println(str.getUsername()+"\t"+str.getAge());
		}

		List<String> list2 = service.listBoard();
		for (String str : list2) {
			System.out.println(str);
		}

		*/
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:board.xml");
		MyService service=ctx.getBean("myService",MyService.class);
		List<String>blist=service.listBoard();
		List<Person> plist=service.listPerson();
		for (Person person : plist) {
			System.out.println(person.getUsername()+"\t"+person.getAge());
		}
		for (String board : blist) {
			System.out.println(board);
		}
	}//end 

}
