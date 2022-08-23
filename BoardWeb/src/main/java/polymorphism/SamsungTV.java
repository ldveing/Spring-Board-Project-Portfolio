package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	@Autowired
	//@Qualifier("apple")
	//@Resource(name="apple")
	private Speaker speaker;
	//private int price;

	// 기본 생성자
	public SamsungTV() {
		System.out.println("=> Samsung TV(1) --- 객체 생성");
	}

	// 생성자 오버로딩 1
	public SamsungTV(Speaker speaker) {
		System.out.println("=> Samsung TV(2) --- 객체 생성");
		this.speaker = speaker;
	}

	// 생성자 오버로딩 2
	/*
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("=> Samsung TV(3) --- 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	*/
	
	//setter
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("=> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("=> setPrice() 호출");
		//this.price = price;
	}
	

	@Override
	public void powerOn() {
		System.out.println("Samsung TV --- 전원을 켠다."/* (가격: " + price + "원)"*/);
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV --- 전원을 끈다");
	}

	@Override
	public void volumeUp() {
		// speaker = new SonySpeaker();
		speaker.volumeUp();
		// System.out.println("Samsung TV --- 볼륨을 올린다");
	}

	@Override
	public void volumeDown() {
		// speaker = new SonySpeaker();
		speaker.volumeDown();
		// System.out.println("Samsung TV --- 볼륨을 내린다");
	}

	// 초기화 메소드
	public void initMethod() {
		System.out.println("Samsung TV --- 객체 초기화");
	}

	// 객체 삭제(해제) 메소드
	public void destroyMethod() {
		System.out.println("Samsung TV --- 객체 삭제");
	}
}
