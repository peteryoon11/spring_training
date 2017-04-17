import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchobeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// echo.xml --> configutaion 파일 읽고 관리하는
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		// classpath class 가 모여 있는 곳
		String mesg=ctx.getMessage("hello", null, Locale.ENGLISH);
		String mesg2=ctx.getMessage("hello2", new String[]{"홍길동","이순신"}, Locale.ENGLISH);
		
	/*	System.out.println(mesg);
		System.out.println(mesg2);
	*/	
		EchoBean echo=ctx.getBean("xxx",EchoBean.class);
		
		echo.sayEcho();
		
		
	}

}
