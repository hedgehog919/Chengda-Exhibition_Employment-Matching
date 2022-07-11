package r1_ProcessControl_package;

import javax.swing.JOptionPane;

public class ProcessControl_switch_case {

// ------------------------------  switch_case -----------------------------
	/*	一個輸入值會進行與他相對應的 value 值中的流程，若不同就會往其他流程走
	 * 輸入值 : short int byte char String ( java SE7 後的版本才有支援 )
	 * 
	 * 
	 * { break 區塊 } ==> 跳出迴圈用
	 *  ! 若未寫的話會一直執行 switch_case  ***迴圈內重要的一部分***
	 * 
	 * 
	 * default 默認 ==> 若甚麼事都不執行的話就會直接進入 default
	 *	\r\n 潛在換行
	 * */		
	public static void main(String[] args) {
	//跳出心理測驗的選項窗格	
		String choice = JOptionPane.showInputDialog(null, " 最近要購買一個新的杯子，你會選擇下面哪一款？\n"
				+"A. 玻璃杯\r\n"
				+"B. 馬克杯\r\n"
				+"C. 酒杯\r\n"
				+"D. 保溫杯\r\n"
				+" 選項提示: A,B,C,D ","心理測驗", JOptionPane.QUESTION_MESSAGE);	
		System.out.println(choice);
		
// ------------ switch 迴圈 ------------- //
		
		switch (choice) {
		case "A":
			System.out.println("選擇玻璃杯的你屬於很特別的類型，你不並適用於專注在某一事物上，\r\n"
					+ "你是屬於擅長按照自己的節奏做事。神奇的是，即便手邊同時有好幾個任務，你都可以順利完成，\r\n"
					+ "並不會因此做得不好或是沒有效率，反而是品質保證、零失誤的狀態！");
		
		case "B":
			System.out.println("選擇B馬克杯帶表你的注意力是普通的。\r\n"
					+ "一般情況下你可以集中注意力，不過你感覺不舒服，\r\n"
					+ "或者如果沒有一個好的環境，你就會分心。\r\n"
					+ "因此如果遇到需要專注的工作時，建議你挑選一個靜謐的環境，\r\n"
					+ "例如圖書館、自習室等都可以，就可以讓你快速又有效率的完成任務！");
			break;
			
		case "C":
			System.out.println("選擇Ｃ酒杯的專注力相當高，你可以特別強烈地專注於你決定需要專注的事情。\r\n"
					+ "但是，相反，在你判斷為「不需要集中註意力」或「與我無關」時，就會變得很散漫。\r\n"
					+ "也因為偶爾你會因為判斷錯誤因此錯失機會，\r\n"
					+ "因此最重要的一點是在決定「是否集中注意力」時不要做出錯誤的判斷。");
			break;
			
		case "D":
			System.out.println("選擇D「保溫杯」的你，專注力非常高。你是一個對自己嚴格，\r\n"
					+ "對任何事情都認真，專注力很強的類型。你可以在非常吵雜的環境下，不受到外界的干擾，可以很投入的在手邊的工作上。\r\n"
					+ "但有時你對自己太嚴格容易有點死腦筋，對於解不出的題，你會很執著的想要完成才進行下個工作，\r\n"
					+ "不過也因為這樣經常把時間耗費在這裏，建議你適當的休息，或是遇到卡住、腦子轉不動時，先跳過它，會讓你更有效率的完成代辦任務喔！");
			break;
			
		default:
			System.out.println("選項輸入錯誤唷 ~ ！");
			break;
		}
		
	}

}
