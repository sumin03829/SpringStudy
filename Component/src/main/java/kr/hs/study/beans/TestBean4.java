package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4 �⺻������");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init �޼ҵ�");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy �޼ҵ�");
	}
}
