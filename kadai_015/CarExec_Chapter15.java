package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		//車データを生成
		Car_Chapter15 car = new Car_Chapter15(1, 10);
		
		//ギアチェンジ
		car.gearChange(3);
		
		//run
		car.run();
		
	}
}
