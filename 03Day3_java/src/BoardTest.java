import java.util.List;

import com.service.BoardService;

public class BoardTest {
	public static void main(String[] args) {
		BoardService service = new BoardService();
		List<String> list = service.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
