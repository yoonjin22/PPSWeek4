package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Day16_7 {
//�迭 �ΰ� �־���
	//num1�� �迭�� �������� num2�� ���� ���� ������ ����
	//�����ҽÿ� num2[i]���� i�� ���� ������ ����� i�� ������ Ŀ�� ��
	//������ �Ȱ���� ���� count�ؾ���
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,7,1,7,5));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,9,2,5,1));
		int count =0;
		int n =-1;
		for(int i=0; i<list1.size(); i++) {
			if(list2.indexOf(list1.get(i))!=-1) {//����Ʈ2���� get1�� ���� ã�����
				if(n<list2.indexOf(list1.get(i))) {//����Ʈ2�� �迭��ġ�� ������ ������������ Ŭ��� count��
				count++;
				n = list1.indexOf(list1.get(i));
				}
			}
		}
		
		System.out.println(count);
		
	}
}
