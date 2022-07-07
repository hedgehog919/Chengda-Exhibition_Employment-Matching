import java.util.Scanner;
public class Number_Crunching_learn1 {	
// 第一題 : 矩形面積運算

	public static void main(String[] args) {
	// 第一步 : new 一個 Scanner 物件
		Scanner sc = new Scanner(System.in);
	
	// 第二步 : 宣告變數
		int rectangleshort;	// short 短
		int rectanglelong; 	// long 長
		int area; // area 面積
	 	
	// 第三步 : 輸入
		System.out.print("短 = ");
		rectangleshort = sc.nextInt();		
		System.out.print("長 = ");
		rectanglelong = sc.nextInt() ;

	// 第四步 : 運算區
		area = rectangleshort * rectanglelong;
	
	// 第五步 : 輸出 
		System.out.println("短邊*長邊 = " + area);
		
	}

}
