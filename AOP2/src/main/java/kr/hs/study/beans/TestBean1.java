package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 ȣ��");
	}
	public void method2() {
		System.out.println("method2 ȣ��");
	}
	public void method3() {
		System.out.println("method3ȣ��");
	}
	
	public void func1() {
		System.out.println("func1 ȣ��");
		int a=10/0; //�����߻�
	}
	public void func2() {
		System.out.println("func2 ȣ��");
	}
	public void func3() {
		System.out.println("func3 ȣ��");
	}
	public int func4() {
		return 100;
	}
}
