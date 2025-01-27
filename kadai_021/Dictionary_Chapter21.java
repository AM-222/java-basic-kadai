package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	//英単語の辞書として機能する
	HashMap<String,String> dicMap = new HashMap<String,String>();
	
	//英単語を登録
	public void setDic() {
		dicMap.put("apple","りんご");
		dicMap.put("peach","桃");
		dicMap.put("banana","バナナ");
		dicMap.put("lemon","レモン");
		dicMap.put("pear","梨");
		dicMap.put("kiwi","キウィ");
		dicMap.put("strawberry","いちご");
		dicMap.put("grape","ぶどう");
		dicMap.put("muscat","マスカット");
		dicMap.put("cherry","さくらんぼ");	
	}

	//辞書を検索
	public void searchDic(String target) {
		if(dicMap.containsKey(target)) {
			System.out.println(target + "の意味は" + dicMap.get(target));	
		} else {
			System.out.println(target + "は辞書に存在しません");
		}
		
	}

}
