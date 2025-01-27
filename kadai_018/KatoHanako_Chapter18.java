package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	//コンストラクタ（初期化）
	public KatoHanako_Chapter18() {
	}
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "花子";
	}
	
	//抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	};
}
