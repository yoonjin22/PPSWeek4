package Week4;

import java.util.ArrayList;

public class Day17_5 {
//두개의 배열주어지고
	//배열 교차 짝이 맞는 것 반환해서 출력하는 메소드 생성
	public static void main(String[] args) {
		
		int[] num1 = {4,9,5};
		int[] num2 = {9,4,9,8,4};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(num1[i]==num2[j]) { //같은 수 나온경우 그 값을 일단 출력하도록 array에 넣어두고 break해서 다음 num1원소 진행
					if(list.contains(num1[i])==false) {
					list.add(num1[i]);
					break;
				}
				}
			}
		}
		System.out.println(list);
		
		
	}
	
}
