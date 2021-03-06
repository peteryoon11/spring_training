import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		Map<String, AnotherBean> list = bean.getXxx();
		
		Iterator<String> iterator = list.keySet().iterator();
		
		
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.print("key=" + key);
			System.out.println(" value= " + list.get(key));
		}
		
		System.out.println("---------");
		
		Set<String> keys=list.keySet();
		
		for (String string : keys) {
			AnotherBean a= list.get(string);
		
			System.out.println(a.getUsername()+"\t"+a.getAge());
		}
		/*
		 * for (AnotherBean anotherBean : list) {
		 * System.out.println(anotherBean); }
		 */
	}
}
