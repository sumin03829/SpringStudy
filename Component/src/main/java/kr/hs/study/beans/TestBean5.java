package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean5 {
	private int data1;
	private String data2;
	
	@Autowired //DataBean4.class�� ��(��ü)�� ������ �� �ּҰ��� data5�� ���Խ��Ѷ�
	private DataBean4 data4;
	@Autowired //DataBean5.class�� ��(��ü)�� ������ �� �ּҰ��� data5�� ���Խ��Ѷ�
	private DataBean5 data5;
	
	public TestBean5() {
		System.out.println("TstBean5 �⺻������");
	}

	//1. ��������� �ڵ����� data4, data5
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
