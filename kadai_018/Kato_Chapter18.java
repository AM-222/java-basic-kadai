package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤";
	public String givenName = "";
	public String address = "住所は東京都中野区〇×です";

	//コンストラクタ（初期化）
	public Kato_Chapter18() {
	}
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address);
	}
	
	//個別の紹介を出力する 抽象メソッド
	abstract public void eachIntroduce();

	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println(""); //1行空ける
	}
}
