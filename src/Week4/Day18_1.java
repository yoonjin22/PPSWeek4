package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day18_1 {
//int n�� ���� ù°�ٿ� �־�������
	//0���� n������ ��� ���� 2������ ��Ÿ�����Ѵ�
	//�װ�쿡 ���� ������ �ִ� 1�� ������ ��Ÿ���� �迭 �����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		//�޾Ƴ� n���� ������ 0���� n���� �������� ��Ÿ���� �޼ҵ��
		for(int i=0; i<=n; i++) {
		String binaryString = Integer.toBinaryString(i); 
		String[] array = binaryString.split("");
		System.out.println(Arrays.toString(array));
		int count = 0;
			for(int j=0;j<array.length; j++) {
				if(array[j].equals(1))
					count+=1;
			}
			list.add(count);
		}
		System.out.println(list);
		//��Ÿ�� ���� ������ 1�� ������ ���� �迭���ҷ� �߰��ϱ�
		
	}
}
