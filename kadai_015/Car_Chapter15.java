package kadai_015;

public class Car_Chapter15 {
	//初期値
	private int gear  = 0;  //1速から5速のギアを表す
	private int speed = 0; //ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter15(final int gear, final int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		
		//速度変更
		switch(afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
