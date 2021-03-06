import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchobeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// echo.xml --> configutaion 파일 읽고 관리하는
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		// classpath class 가 모여 있는 곳
		// 생성된 echo bean 참조 3가지
		EchoBean echoRef1 = ctx.getBean(EchoBean.class);
		System.out.println(echoRef1.sayEcho());
		EchoBean echoRef2=(EchoBean) ctx.getBean("xxx");
		System.out.println(echoRef2.sayEcho());
		EchoBean echoRef3=ctx.getBean("xxx",EchoBean.class);
		System.out.println(echoRef3.sayEcho());
	}

}
