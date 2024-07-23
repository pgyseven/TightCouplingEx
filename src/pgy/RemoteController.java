package pgy;

public class RemoteController {
	private Tv tv; // 맴버변수는 null로 초기화 되어있음을 참고하라! / 약간 억지지만 티비랑 리모컨은 한세트로 들어있으니깐 가성하에 여기 포함한거
	
	//생성자
	public RemoteController(Tv tv) {
		super();
		this.tv = tv;
	}
	
	
	
	public void remotePowerOnOff() {
		tv.powerOnOff();
	}


	
}
