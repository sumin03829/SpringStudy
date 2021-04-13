package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void beforeMethod() {
		System.out.println("beforeȣ��");
	}
	public void afterMethod() {
		System.out.println("after ȣ��");
	}
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around �޼��� ȣ����");
//		pjp.proceed(); //���� �޼���(����Ͻ� ����) ȣ��
		int a=(Integer)pjp.proceed();
		System.out.println("around�޼��� ȣ����");
		//return a;
	}
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing �޼��� ȣ��");
	}
	public void afterReturning() {
		System.out.println("afterReturning �޼��� ȣ��");
	}
}
