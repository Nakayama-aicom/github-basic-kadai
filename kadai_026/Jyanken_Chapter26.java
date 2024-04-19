package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	String scannerWord;
	String scannerHand;
	int p = 0;
	String randomHand;
	
		
	public String getMyChoice(){
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			String scannerWord = scanner.nextLine();
			
			if(scannerWord.equals("r") || scannerWord.equals("s") || scannerWord.equals("p")) {
				this.scannerHand = scannerWord;
				return this.scannerHand;
			}else {
				System.out.println("正しいじゃんけんの手ではありません");
				continue;
			}
		}
	}
		
	
	public String getRandom(){
		
		String[] hands = {"r", "s", "p"};
		
		p = (int)Math.floor(Math.random() * 2);
		this.randomHand = hands[p];
		return this.randomHand;
	}
	
	
	public void playGame(){
			
		getMyChoice();
		getRandom();
		
	
		HashMap<String,String> handsMap = new HashMap<String,String>();
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		System.out.println("自分の手は" + handsMap.get(scannerHand) + ",対戦相手の手は" + handsMap.get(randomHand));
		
		if(scannerHand.equals(randomHand)){
			System.out.println("あいこです");
		}else if(scannerHand.equals("r") && randomHand.equals("s")){
			System.out.println("自分の勝ちです");
		}else if(scannerHand.equals("s") && randomHand.equals("p")){
			System.out.println("自分の勝ちです");
		}else if(scannerHand.equals("p") && randomHand.equals("r")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}

}
