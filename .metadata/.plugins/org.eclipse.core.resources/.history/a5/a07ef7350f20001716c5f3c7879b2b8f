import java.util.List;

import com.dto.Person;
import com.service.BoardService;
import com.service.PersonService;

public class BoardTest {

	public static void main(String[] args) {
		PersonService service = new PersonService();
		List<Person> list = service.list();
		for (Person str : list) {
			System.out.println(str.getUsername()+"\t"+str.getAge());
		}

		BoardService service2 = new BoardService();
		List<String> list2 = service2.list();
		for (String str : list2) {
			System.out.println(str);
		}

		
	}//end 

}
