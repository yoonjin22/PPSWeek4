package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



//������������ ���� (��-> ū)
//����������sum�̶�� �迭�� ���� 
//�� �迭�� ���Ҵ� �־��� num1�迭�� ���� i��°������ ������ ���� ���̴�
//���߿� total ���

public class Day17_9 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		ArrayList<Integer> num1 = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
		num1.add(scanner.nextInt());
		}
		
		Collections.sort(num1);//�������� ����
		
		int total=0;
		ArrayList<Integer> sum = new ArrayList<>();
		for(int n = 0; n<num; n++) {
			total +=(num-n)*num1.get(n);
		}
		System.out.println(total);
		
		
		
	}
}
