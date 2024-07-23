package pgy;

public class Tv {
	private String brandName;
	private boolean power; //처음에는 false로 초기화 되어있음
	private int channel;
	
	public Tv(String brandName) {
		super();
		this.brandName = brandName;
	}
	
	public void powerOnOff() {
		this.power = !this.power;
		
		if(this.power) {
			System.out.println(this.brandName + "TV가 켜짐");
		}else {
			System.out.println(this.brandName + "TV가 꺼짐");
			
		}
	}
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널" + this.channel);
	
		
	}
}
