package com.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;

@Aspect // aop 에서 사용하는 빈임
public class MethodAspect {

	static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(EchoBean.class);

	@Pointcut("execution(public * say*(..))")
	public void xxx2() {
		
	}

	/*
	 * @AfterThrowing(pointcut="xxx2()",throwing="xx") public void
	 * exception(Throwable xx) { System.out.println(xx.getMessage()+" 에러 메시지");
	 * System.out.println("exception");
	 * 
	 * }
	 */
	@Around("xxx2()")
	public Object around11(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("before");
			LOGGER.info("before");
			LOGGER.warn("before");
			LOGGER.error("before");
			LOGGER.trace("before");

			// LOGGER.info("before");

			obj = pjp.proceed();
			System.out.println(obj + " ??");
			// System.out.println("after");

			// Object obj= pjp.proceed();

		} catch (Throwable e) {
			// TODO: handle exception

		}

		System.out.println("around11");
		return obj;
	}
	/*
	 * @Before("xxx2()") public void beforeLoggin(JoinPoint jp) {
	 * System.out.println(jp.getSignature().getName()+ " 메소드 이름!! ");
	 * System.out.println("beforeLoggin"); }
	 */
	/*
	 * @After("xxx2()") // 비정상 or 정상 둘다 실행 됨!! public void afterLoggin() {
	 * System.out.println("afterLogging"); }
	 */
	/*
	 * @AfterReturning(pointcut = "execution(public * say*(..))",returning="xx")
	 * // return 값을 xx 라는 변수에 넣어서 public void aaa(JoinPoint jp,Object xx) {
	 * 
	 * System.out.println(xx + " 리턴 값 ");
	 * System.out.println(jp.getSignature().getName()+ " 메소드 이름!!");
	 * System.out.println("@AfterReturning "); }
	 */

}
