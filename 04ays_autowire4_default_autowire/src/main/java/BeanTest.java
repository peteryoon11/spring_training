import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
import com.test.EchoBean;

public class BeanTest {

	public static void main(String []args)
	{
		//IoC Container ==> ApplicationContext 
		
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean bean=ctx.getBean("echobean",EchoBean.class);
		AnotherBean another=bean.getAnotherBean();
	
		System.out.println("dd " +another.getUsername()+"\t"+another.getAge());
	
	}
}
