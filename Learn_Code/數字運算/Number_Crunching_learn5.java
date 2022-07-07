import java.util.Scanner;

public class Number_Crunching_learn5 {
// 第五題 : 計算 BMI

		// 建立計算 BMI 的方法
    public static String BMIChecker(double Weight, double Height) {

        // 計算 BMI
        double BMI = Weight / ( Height * Height) ;

        // 確認 BMI 範圍
        if(BMI < 18.5)
            return "過輕";	// 小於 18.5 為 Underweight 過輕
        else 
        	
        if(BMI < 24)
            return "正常";		// 小於 24 為 Normal 正常
        else 
        
        if(BMI < 27)
            return "過重";	// 小於 27 為 Overweight 過重
        else
        
            return "肥胖";	// 大於 27 為 Obese 肥胖
    }
	
	public static void main(String[] args) {
		Scanner scan_input = new Scanner(System.in);
		
		   	double Weight = 0.0d;	
	        double Height = 0.0d;
	        String BMI_Result = null;

	        System.out.print(" 請輸入您的體重 (公斤) :  ");
	        Weight = scan_input.nextDouble();
	        System.out.print(" 請輸入您的身高 (公尺) :  ");
	        Height = scan_input.nextDouble();
	        
	        BMI_Result = BMIChecker( Weight, Height ); // 回到 6-26 執行 BMI 計算方法

	        System.out.println();
	        System.out.println("    BMI 範圍 : " + BMI_Result);	// 印出 BMI 結果

	        scan_input.close();
		
	}

}
