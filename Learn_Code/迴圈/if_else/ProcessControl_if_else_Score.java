package ProcessControl_class;

import java.util.Scanner;

public class ProcessControl_Exam04_05 {
/*	題目: 輸入成績分 ABCDE 等級
 *  Import: 0 ~ 100 的整數
 *  Output: A,B,C,D,E 級
 *  Use if...else 
 *  
 *  
 *  
 *  while ( 執行條件 ){.....}   
 *  此 while 迴圈的執行條件寫成 true 時 => 表示無條件成立變成無窮(永久)迴圈
 *  
 * 
 * */		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
	
		while(true) {
			System.out.print(" 請輸入成績 :  ");
			score = sc.nextInt();			
			
			if (score >= 90) {
				System.out.println(score + "分是 A 級");
			}else{ if (score >= 80) {
				System.out.println(score + "分是 B 級");
			} else { if (score >= 70) {
				System.out.println(score + "分是 C 級");
			} else { if (score >= 60) {
				System.out.println(score + "分是 D 級");
			} else { if (score < 60) {
				System.out.println(score + "分是 E 級");
			} else {
				
				System.out.println("-------------------------------");
				}
			}
			}
			}
			}
		}
	}

}
