import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ApplicationContext ctx=new GenericXmlApplicationContext("classpath:echo.xml");
		ApplicationContext ctx=new GenericXmlApplicationContext("file:c:\\temp\\echo.xml");
		
		EchoBean ebean=ctx.getBean("xxx",EchoBean.class);
	ebean.sayEcho();
	}

}