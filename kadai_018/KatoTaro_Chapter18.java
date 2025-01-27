package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	//コンストラクタ（初期化）
	public KatoTaro_Chapter18() {
	}
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "太郎";
	}
	
	//抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	};
}
