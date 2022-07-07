import java.util.Scanner;

public class Number_Crunching_learn3 {
// 第三題 : 三角餅乾貴蔘蔘
	
/* 提示 :
 * 	輸入：三邊長a,b,c(浮點數 float)
 * 	變數宣告：需要幾個？叫甚麼名字？
 *	運算：三角形面積，海龍公式A=√(𝑠(𝑠−𝑎)(𝑠−𝑏)(𝑠−𝑐))，其中𝑠=(𝑎+𝑏+𝑐)/2
 * 	輸出：面積的平方
 * */	
	public static void main(String[] args) {

	// 第一步 
		Scanner sc = new Scanner(System.in);
	
	// 第二步 宣告變數
		float trilong; // 長邊
		float trishort1; // 短邊1
		float trishort2; // 短邊2
		float trihigh; // 高
		float area; // area 面積
		
	// 第三步 輸入
		System.out.print(" 長邊 = ");
		trilong = sc.nextFloat();
		System.out.print(" 短邊1 = ");
		trishort1 = sc.nextFloat();
		System.out.print(" 短邊2 = ");
		trishort2 = sc.nextFloat();
		
	// 第四步 運算
		trihigh = trilong + trishort1 + trishort2 / 2 ;
		area = trihigh * (trihigh-trilong) * (trihigh-trishort1) * (trihigh-trishort2);
		
	// 第五步 輸出三角形面積
		System.out.println(" 三角形面積 = " + area);
		
		
	}

}
