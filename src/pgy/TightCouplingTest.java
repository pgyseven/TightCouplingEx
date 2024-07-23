package pgy;

public class TightCouplingTest {

	//강결합을 알아본다.
	public static void main(String[] args) {
	// Tv 객체와 리모컨 객체가 있다. 두 객체를 강 결합(Tight Coupling) 시켜 리모컨으로 Tv를 작동시키는 예를 구현해 보자
	
		Tv 삼송티비 = new Tv("삼송");
		
		삼송티비 =  null; //티비가 없으묜 리코컨도 동작 안함의 예시에 사용
		
		삼송티비.powerOnOff();

		삼송티비.powerOnOff();
		
		RemoteController 리모컨 = new RemoteController(삼송티비);
		리모컨.remotePowerOnOff(); //생성자 없이 이렇게 하면 private Tv tv; 가 널이라 에러뜬다.
		
		리모컨.remotePowerOnOff();
	}

}
