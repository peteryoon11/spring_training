import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

//import antlr.collections.List;

public class BeanTest {

	public static void main(String[] args) {
		// IoC Container ==> ApplicationContext

		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean bean = ctx.getBean("echobean", EchoBean.class);
		/*
		 * AnotherBean another=bean.getAnotherBean();
		 * 
		 * System.out.println(another.getUsername()+"\t"+another.getAge());
		 */
		Properties list = bean.getXxx();

		Set<String> keys = list.stringPropertyNames();
	
		for (String string : keys) {
			// t.get(string));
			String value = list.getProperty(string);
			System.out.println(string + "\t" + value);

		}
	}
}
