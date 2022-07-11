package r1_ProcessControl_package;

public class ProcessControl_forloop01_03 {

	public static void main(String[] args) {

/*	雙層迴圈 ( 巢狀迴圈 ) => 迴圈中的迴圈 
 * 面對需要有多個變數運算時所使用的迴圈動作
 * 
 * */		
		
/*	break : 脫離迴圈 => 脫離在最接近 break 的迴圈上
 * 		1. if 不算迴圈，所以 break 只會作用在 if 外面的迴圈	
 * 		2. 可以作用在 switch 迴圈上
 * 
 * 	continue : 繼續迴圈 => 遇到 if 後會回到上一句繼續執行
 * 		1. 不能作用在 switch 迴圈上
 * 
 * */				
		
// 九九乘法表		
/* 標籤語句 => 在要跳出哪行程式前加一個 Z(標籤名):
 * 標籤位置作用 =>
 * 1. break ，會直接跳到標籤區塊的最外層
 * 2. continue => 不換行，讀到指定程式碼時會直接繼續執行下一步
 * https://yaya741228.pixnet.net/blog/post/79041246
 * */ 
		
		int total = 0;
		String s = null;
		Z:for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
 				if(j==5) continue Z;	// continue 會繼續此迴圈，所以他會回到上一步繼續執行，並跳過 5
				System.out.print(j + "x" + i + "=" + (j*i)+ "\t");
//				if(j==5)break;	// break 會直接脫離迴圈，5 以下的皆不執行
			}
				System.out.println();
		}

	}

}
