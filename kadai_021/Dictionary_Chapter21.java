package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public String[] search;
	
	public void Dictionary(String[] search){
		HashMap<String, String> wordList = new HashMap<String, String>();
		wordList.put("apple", "りんご");
		wordList.put("peach", "桃");
		wordList.put("banana", "バナナ");
		wordList.put("lemon", "レモン");
		wordList.put("pear", "梨");
		wordList.put("kiwi", "キウィ");
		wordList.put("strawberry", "いちご");
		wordList.put("grape", "ぶどう");
		wordList.put("muscat", "マスカット");
		wordList.put("cherry", "さくらんぼ");
		

		
		for(int i = 0; i < search.length; i++) {
			
			if (wordList.containsKey(search[i])) {
				 System.out.println(search[i] + "の意味は" + wordList.get(search[i]));
			 }else {
				 System.out.println(search[i] + "は辞書に存在しません");
			 }
			
		}
		
	}
}
