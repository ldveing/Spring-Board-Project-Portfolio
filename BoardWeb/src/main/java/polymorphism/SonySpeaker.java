package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker{
	
	public SonySpeaker() {
		System.out.println("=> SonySpeaker --- 생성자");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker --- 볼륨을 올린다");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker --- 볼륨을 내린다");
	}
}
