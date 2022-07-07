import java.util.Scanner;

public class Number_Crunching_learn2 {
// 第二題 : 輸入三科成績算總和

	public static void main(String[] args) {

	// 第一步 new 物件 
		Scanner sc	= new Scanner(System.in);
	
	// 第二步 宣告變數
		int firstscore;
		int secondscore;
		int thirdscore;
		int totalscore;
	
	// 第三步 輸入 --> 於 Console 輸入值
		System.out.print(" 第一科成績 = ");
		firstscore = sc.nextInt();
		System.out.print(" 第二科成績 = ");
		secondscore = sc.nextInt();
		System.out.print(" 第三科成績 = ");
		thirdscore = sc.nextInt();
		
	// 第四步 運算
		totalscore = firstscore + secondscore + thirdscore;
		
	// 第五步 輸出成績	
		System.out.println(" 三科成績總和 = "+ totalscore);
		
	}

}
