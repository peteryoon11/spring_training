import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.test.AnotherBean;
import com.test.EchoBean;

public class BeanTest {

	public static void main(String []args)
	{
		//IoC Container ==> ApplicationContext 
		
	/*ConfigurableApplicationContext ctx=new GenericXmlApplicationContext();
		
		ConfigurableEnvironment environment= ctx.getEnvironment();
		
		*/
		
		
		
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean bean=ctx.getBean("echobean",EchoBean.class);
		AnotherBean another=bean.getAnotherBean();
	
		System.out.println(another.getUsername()+"\t"+another.getAge());
	
	}
}
