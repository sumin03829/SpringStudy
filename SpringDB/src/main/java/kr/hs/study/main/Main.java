package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		//LoginDAO가져오기
		//LoginDTO 가져오기(id:bean1)
		//bean1에 kim, 1111세팅
		//dao의 메서드 호출
		ctx.close();
	}

}
