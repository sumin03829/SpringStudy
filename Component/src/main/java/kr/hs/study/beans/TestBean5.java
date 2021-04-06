package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean5 {
	private int data1;
	private String data2;
	
	@Autowired //DataBean4.class의 빈(객체)가 있으면 그 주소값을 data5에 대입시켜라
	private DataBean4 data4;
	@Autowired //DataBean5.class의 빈(객체)가 있으면 그 주소값을 data5에 대입시켜라
	private DataBean5 data5;
	
	public TestBean5() {
		System.out.println("TstBean5 기본생성자");
	}

	//1. 멤버변수에 자동주입 data4, data5
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public DataBean5 getData5() {
		return data5;
	}
	
}
