import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
import com.test.EchoBean;

public class BeanTest {

	public static void main(String[] args) {
		// IoC Container ==> ApplicationContext

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean bean = ctx.getBean("echobean2", EchoBean.class);

		AnotherBean another = bean.getAnotherBean();
		if (another != null)
			System.out.println(another.getUsername() + "\t++" + another.getAge());
	
		else {
			System.out.println("null 임 ");
		}
	
	}
}
