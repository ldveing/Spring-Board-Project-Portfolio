package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		/*
		< SamsungTV에서 LgTV로 바꾸는 과정 >
		- 1, 2번: Java에서 할 수 있는 방법
		1. 각각의 클래스
		- 문제점 - 고칠 내용이 많아서, 유지 보수가 어렵다
		2. 개선 - 인터페이스를 만들어 구현하는 관계로 변경
		- 문제점 - 소스 코드를 고쳐야 함
		-------------------------------------------
		
		Spring으로 할 수 있는 방법
		3. Factory 디자인 패턴
		- 소스 코드를 고치지 않아도 TV를 변경 가능
		- Spring에 내포되어 있는 방법
		*/
		
		/* 1, 2번: Java에서 할 수 있는 방법 
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		// 3. 아래의 소스코드를 고치지 않음. (직접 만든 Factory 클래스를 활용)
		/*
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		// 4. 아래의 소스코드를 고치지 않음. (Spring에서 제공하는 방법을 사용)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); // 해당 클래스에서 읽어들임.
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 객체 여러 번 호출 -> 한번만 실행 (싱글톤 패턴이 적용 됨)
		/*
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		*/
		
		
		factory.close();
	}
}
