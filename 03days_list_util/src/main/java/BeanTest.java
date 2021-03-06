import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
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

		List<AnotherBean> list = bean.getXxx();
		for (AnotherBean anotherBean : list) {
			System.out.println(anotherBean);
		}

	}
}
