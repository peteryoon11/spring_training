import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.Echo;

public class EchobeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// echo.xml --> configutaion 파일 읽고 관리하는 
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		// classpath class 가 모여 있는 곳 
		ctx.getEnvironment().setActiveProfiles("prod");
//		EchoDev dev=ctx.getBean("",EchoDev.class);
	ctx.load("classpath:echoDev.xml","classpath:echoProd.xml");
	ctx.refresh();
	Map<String,Object> test=null;
	
	Echo dev=ctx.getBean(Echo.class);
	
	System.out.println(dev.sayEcho("hello"));
	}

}
