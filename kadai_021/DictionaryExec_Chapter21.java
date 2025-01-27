package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		//辞書を初期化
		dic.setDic();
		
		//調べる英単語をセット
		String[] words = {"apple", "banana", "grape", "orange"};
		
		//辞書で調べる
		for(int i = 0; i < words.length; i++) {
			dic.searchDic(words[i]);
		}
	}
}
