import java.util.List;

import com.dto.Person;
import com.service.MyService;

public class BoardTest {

	public static void main(String[] args) {
		MyService service = new MyService();
		List<Person> list = service.listPerson();
		for (Person str : list) {
			System.out.println(str.getUsername()+"\t"+str.getAge());
		}

		List<String> list2 = service.listBoard();
		for (String str : list2) {
			System.out.println(str);
		}

		
	}//end 

}
