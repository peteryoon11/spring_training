import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EchobeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// echo.xml --> configutaion 파일 읽고 관리하는 
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:com/test/echo.xml");
		// classpath class 가 모여 있는 곳 
	}

}
