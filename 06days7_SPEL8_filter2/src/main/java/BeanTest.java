import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
import com.test.EchoBean;

public class BeanTest {

	public static void main(String []args)
	{
		//IoC Container ==> ApplicationContext 
		
		ApplicationContext ctx=new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean bean=ctx.getBean("echo5",EchoBean.class);
		List<String> another=bean.getList();
	
		for (String string : another) 
		{
			System.out.println(string);	
		}
	/*	System.out.println(another.getUsername()+"\t"+another.getAge());
	*/
	}
}
