import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;
import com.service.BoardService;
import com.service.PersonService;

public class BoardTest {

	public static void main(String[] args) {
		/*
		 * PersonService service = new PersonService(); List<Person> list =
		 * service.list(); for (Person str : list) {
		 * System.out.println(str.getUsername()+"\t"+str.getAge()); }
		 * 
		 * BoardService service2 = new BoardService(); List<String> list2 =
		 * service2.list(); for (String str : list2) { System.out.println(str);
		 * }
		 * 
		 */
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:board.xml", "classpath:person.xml");
		BoardService bservice = ctx.getBean("boardService", BoardService.class);
		PersonService pservice = ctx.getBean("personService", PersonService.class);

		List<String> blist =bservice.list();
		for (String string : blist) {
			System.out.println(string);
		}
		System.out.println("-----------");
		List<Person> plist=pservice.list();
		for (Person person : plist) {
			System.out.println(person.toString()+"\t"+person.getUsername()+"\t"+person.getAge());
		}
		
	}// end

}
