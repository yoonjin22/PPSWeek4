package Week4;

import java.util.ArrayList;
import java.util.Arrays;

//배열에서의 길이를 n이라하고 
//배열에서 원소들이 1부터 n까지의 수들 포함하지 않는 수가 있으면 그값을 반환한다.
public class Day16_2 {
	
	public static void main(String[] args) {
		int[] nums = {1,1};
		int size = nums.length;
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1));
		
		ArrayList<Integer> find = new ArrayList<>();
		for(int i=0; i<size; i++) {
			if(list.indexOf(i+1)==-1)
				find.add(i+1);
				
		}
		System.out.println(find);
	}

}
