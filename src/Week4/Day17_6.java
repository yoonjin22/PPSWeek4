package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day17_6 {
	//�迭 �ΰ� �־���
	//�迭 2�� �ִ� ���Ҵ� ��� �ٸ���
	//�迭 2�� �ִ� ���� ������� �迭 1�� ���ҵ��� ������
	public static void main(String args[]) {
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(2,3,1,3,2,4,6,7,9,2,19));
		ArrayList<Integer> num2  = new ArrayList<Integer>(Arrays.asList(2,1,4,3,9,6));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int j=0; j<num2.size(); j++) {
			for(int i=0; i<num1.size(); i++) {
			if(num2.get(j)==num1.get(i))
				list.add(num2.get(j));
		}
		}
		
		
		Collections.sort(num1);
		for(int i=0; i< num1.size(); i++) {
			if(num2.contains(num1.get(i))==false) {
				list.add(num1.get(i));
			}
				
		}
		System.out.println(list);
	
	
	
	}

}
