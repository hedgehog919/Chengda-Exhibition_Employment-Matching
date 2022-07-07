import java.util.Scanner;

public class Number_Crunching_learn4 {
// 第四題 : 溫度轉換，華氏轉攝氏
// 攝氏溫度=("華氏溫度 − 32)"×5/9 (想想怎麼來的?)

		public static void main(String[] args) {
		// Top1
			Scanner sc = new Scanner(System.in);
			
		// Top2
			double c;
			double f;
			
		// Top3	
			 System.out.print(" 請輸入華氏溫度 =  " ) ;	
			 c = sc.nextDouble();

//			 System.out.print("華氏溫度 =  " + c + " 度 " ) ;
			 
		// Top4
		      f = (c - 32 ) * 5 / 9 ;
		
	   // Top5       
		      System.out.print( " 攝氏溫度 = " + f + " 度") ;
			
		}
		
		
}
