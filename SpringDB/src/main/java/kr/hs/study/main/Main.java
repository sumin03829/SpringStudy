package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		//LoginDAO��������
		//LoginDTO ��������(id:bean1)
		//bean1�� kim, 1111����
		//dao�� �޼��� ȣ��
		ctx.close();
	}

}
