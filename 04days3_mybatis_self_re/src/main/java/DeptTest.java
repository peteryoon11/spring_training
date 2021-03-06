import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.DeptDTO;
import com.service.DeptService;

public class DeptTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		DeptService service = ctx.getBean("deptService", DeptService.class);
		// service.insert(new DeptDTO(88,"개발","서울"));
		List<DeptDTO> list = service.select();
		for (DeptDTO deptDTO : list) 
		{
			System.out.println(deptDTO.getDeptno());
		}
	}
}
