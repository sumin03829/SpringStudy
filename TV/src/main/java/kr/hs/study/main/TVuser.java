package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.JavaConfig;

public class TVuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		SamsungTV s=ctx.getBean("samsung", SamsungTV.class);
		System.out.println(s.getPrice());
		System.out.println(s.getSpeaker());
		System.out.println(s.getSpeaker().VolumeUP());
		System.out.println(s.getSpeaker().VolumeDown());
		System.out.println(s.PowerOn());
		System.out.println(s.PowerDown());
		
		LgTV l=ctx.getBean("lg", LgTV.class);
		System.out.println(l.getPrice());
		System.out.println(l.getSpeaker());
		System.out.println(l.getSpeaker().VolumeUP());
		System.out.println(l.getSpeaker().VolumeDown());
		System.out.println(l.PowerOn());
		System.out.println(l.PowerDown());
		ctx.close();
		
		System.out.println("========================================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		SamsungTV s2=ctx2.getBean("samsung", SamsungTV.class);
		System.out.println(s2.getPrice());
		System.out.println(s2.getSpeaker());
		System.out.println(s2.getSpeaker().VolumeUP());
		System.out.println(s2.getSpeaker().VolumeDown());
		System.out.println(s2.PowerOn());
		System.out.println(s2.PowerDown());
		
		LgTV l2=ctx2.getBean("lg", LgTV.class);
		System.out.println(l2.getPrice());
		System.out.println(l2.getSpeaker());
		System.out.println(l2.getSpeaker().VolumeUP());
		System.out.println(l2.getSpeaker().VolumeDown());
		System.out.println(l2.PowerOn());
		System.out.println(l2.PowerDown());
		ctx2.close();
	}
}
