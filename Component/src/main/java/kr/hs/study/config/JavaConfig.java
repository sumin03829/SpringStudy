package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean6;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public TestBean1 test() {
		TestBean1 t1=new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean6 test2() {
		TestBean6 t8=new TestBean6();
		t8.setA(200);
		t8.setB(55.55);
		t8.setC(new DataBean4());
		t8.setD(new DataBean5());
		return t8;
		
	}
	
}
