import java.util.Map;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class EchobeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// echo.xml --> configutaion 파일 읽고 관리하는 
		//ApplicationContext ctx=new GenericXmlApplicationContext();
		// classpath class 가 모여 있는 곳 
		
		ConfigurableApplicationContext ctx=new GenericXmlApplicationContext();
		
		ConfigurableEnvironment environment= ctx.getEnvironment();
		
		Map<String,Object> map=environment.getSystemEnvironment();
		
		
		Set<String> keys=map.keySet();
		
		for (String string : keys) {
			System.out.println(string+" = "+map.get(string));
		}
	
		Map<String,Object> map2=environment.getSystemProperties();
		
		Set<String> keys2=map2.keySet();
		
		System.out.println("-----------------");
		
		for (String string : keys2) 
		{
			System.out.println(string+" = "+map2.get(string));
		}
		
	}

}
