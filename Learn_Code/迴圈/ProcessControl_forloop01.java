package r1_ProcessControl_package;

import java.util.Scanner;

public class ProcessControl_forloop01 {

	public static void main(String[] args) {
		int[][] arr1= {{1,2},{3,4},{5,6},{7,8}};
		int[][] ans=new int[2][4];

/*	for - loop 講義p48 ; 課本p3-21
 * 語意: 從初值開始執行(重複程式敘述)後，再增加值直到完成離開迴圈條件
 * 脫離迴圈條件: 
 * 	條件為 True 時 => 重複執行
 * 	條件為 False 時 => 離開迴圈
 * 
 * 
 *  var 宣告 i 時，初值為 1，程式執行時 i 值每次都會+1，i 值為 101 時會離開迴圈 
 *   j 為浮點數，初值為 0，每次增加 0.25 ， j 值為 10 離開迴圈
 * 
 * https://openhome.cc/zh-tw/java/syntax-abc/for-while/
 * */		
		for (int i = 0; i < arr1.length;i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				ans[j][i] = arr1[i][j]; 
			}
		}
		
		for(int[] is : ans) {
			for(int i : is) {
				System.out.print(i + ",");
			}
			System.out.println();
		}	
			// Console ={{1,3,5,7},{2,4,6,8}};

// ------------------------------------------------------------ //
			System.out.println("//--------- for 迴圈範例2 -------//");
// 1 ~ 100
// 正常版			
		int total = 0;
		for(int i=1;i<=100;i+=1) {	// 宣告
			total += i;
		}
			System.out.println("total= "+total);
	


/* 
 * for 迴圈準則：
 * 1. 可以「宣告」
 * 2. 只要是「程式語句」就可以
 * 3. 中間只要是「布林值」也可以
 * 
 * */	
			

// 無限迴圈 - 無使用 while 下的 for 無限迴圈
// 兩個分號等於一個 while 迴圈
			
		int total4 = 0;
		String s = null;
		for(;;) {
			System.out.println("我是程式債王 ~  ~ XD");
		}
			
	}
}
