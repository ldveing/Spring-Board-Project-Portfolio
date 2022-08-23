package polymorphism;

//@Component("tv")
public class LgTV implements TV {
	//@Inject
	//@Autowired
	//@Qualifier("sony")
	//@Resource(name="apple")
	private Speaker speaker;
	private int price;

	// 생성자 오버로딩 1
	public LgTV(Speaker speaker) {
		System.out.println("=> LG TV(2) --- 객체 생성");
		this.speaker = speaker;
	}

	// 생성자 오버로딩 2
	public LgTV(Speaker speaker, int price) {
		System.out.println("=> LG TV(3) --- 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	// setter
	public void setSpeaker(Speaker speaker) {
		System.out.println("=> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("=> setPrice() 호출");
		this.price = price;
	}

	// 기본 생성자
	public LgTV() {
		System.out.println("=> LG TV --- 객체 생성");
	}

	// 초기화 메소드
	public void initMethod() {
		System.out.println("LG TV --- 객체 초기화");
	}

	// 객체 삭제(해제) 메소드
	public void destroyMethod() {
		System.out.println("LG TV --- 객체 삭제");
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV --- 전원을 켠다. (가격: " + price + "원)");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV --- 전원을 끈다");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		//System.out.println("LG TV --- 볼륨을 올린다");
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("LG TV --- 볼륨을 내린다");
	}
}
