package r1_ProcessControl_package;

public class ProcessControl_forloop01_02 {

	public static void main(String[] args) {
		// 大括號內的數字是引數，要傳入 list 陣列內的值
		int [] [] intListList = {{1,2,3},{4,5,6},{7,8,9}};	
		
		// for (元素:疊代對象)
		for (int[] is : intListList) {
			for(int 一個東西:is) {
				System.out.print(一個東西 + ",");
				
			}
		System.out.println();
		}
		
	}
}
