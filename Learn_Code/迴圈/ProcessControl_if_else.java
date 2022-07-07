package r1_ProcessControl_package;

import java.util.Scanner;

public class ProcessControl_if_else {

// ------------------------------  if_else -----------------------------
	/*	if...else 基礎迴圈
	 * 	如果符合第一個條件就執行第一個條件，不是就往下走第二個條件
	 * 
	 * */
	public static void main(String[] args) {
		
	
// 	火車票購買資格
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 請輸入你的年齡 : ");
		String name = sc.next();
		Integer age =Integer.valueOf(name);
		
			if (age < 10) {	// 第一個條件
				System.out.println(" 請購買兒童票");
			} else {
			if (age < 18) {	// 第二個條件
				System.out.println(" 請購買半票");
			} else {
			if (age < 65) {	// 第三個條件
				System.out.println(" 請購買全票");
			} else 
			if (age >= 65) {	// 第四個條件
				System.out.println(" 請購買敬老票");
			} else {
			}
			}
			}		
			
	}

}
