package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4 기본생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init 메소드");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy 메소드");
	}
}
