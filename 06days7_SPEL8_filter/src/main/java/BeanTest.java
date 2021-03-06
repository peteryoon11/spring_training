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
		EchoBean bean=ctx.getBean("echo2",EchoBean.class);
		List<AnotherBean> another=bean.getList();
	
		for (AnotherBean anotherBean : another) {
			System.out.println(anotherBean);
		}
	/*	System.out.println(another.getUsername()+"\t"+another.getAge());
	*/
	}
}
