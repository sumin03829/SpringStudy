package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.beans.TestBean6;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestBean1 가지고와서 주소값 출력
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1=ctx1.getBean("obj1",TestBean1.class);
		TestBean2 t3=ctx1.getBean(TestBean2.class);
		System.out.println(t3);
		System.out.println(t1);
		ctx1.close();
		
		System.out.println("=====================================================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean1 t2=ctx2.getBean("test",TestBean1.class);
		System.out.println(t2);
		
		TestBean2 t4=ctx2.getBean(TestBean2.class);
		System.out.println(t4);
		
		TestBean3 t5=ctx2.getBean(TestBean3.class);
		System.out.println(t5);
		TestBean4 t6=ctx2.getBean(TestBean4.class);
		System.out.println(t6);

		TestBean5 t7=ctx2.getBean(TestBean5.class);
		System.out.println(t7);
		
		
		TestBean6 t8=ctx2.getBean("test2",TestBean6.class);
		System.out.println(t8.getA());
		
		
		ctx2.close();
	}

}
