package Week4;

import java.util.ArrayList;

public class Day17_5 {
//�ΰ��� �迭�־�����
	//�迭 ���� ¦�� �´� �� ��ȯ�ؼ� ����ϴ� �޼ҵ� ����
	public static void main(String[] args) {
		
		int[] num1 = {4,9,5};
		int[] num2 = {9,4,9,8,4};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(num1[i]==num2[j]) { //���� �� ���°�� �� ���� �ϴ� ����ϵ��� array�� �־�ΰ� break�ؼ� ���� num1���� ����
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
