package ProcessControl_learn;

import java.util.Scanner;

public class ProcessControl_Exam04_learn02 {

/*	題目: 輸入三角形邊長，判斷是否可以形成三角形
 * 三角形定義 => 三角形中任兩邊的和需大於第三邊
 * 		進階 => 	1. 是否為正三角形 ? 
 * 			   	2. 是否為直角三角形 ?
 * 				3. 是否為銳角三角形 ?
 * 				4. 是否為鈍角三形 ?
 * */			
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a, b, c;

	while(true) {	
		System.out.print(" 三角形第一個邊 = ");
		a = sc.nextInt();
		System.out.print(" 三角形第二個邊 =");
		b = sc.nextInt();
		System.out.print(" 三角形第三個邊 =");
		c = sc.nextInt();
	
			if ((a + b > c ) && (b + c > a) && (a + c > b)) {	
				System.out.println(" 可以形成三角形 !");
				if ((a == b) && (b == c) ) {	// if 條件
					System.out.println("而且是正三角形 !");	// 條件成立時要做的事
				}
			} else {
				System.out.println(" 不可以形成三角形 !!!");
			}
			
			System.out.println(" ======================== ");
			
		}
	}
	
}
