package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
//type으로 등록한다.
public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2 기본생성자.");
	}
}
