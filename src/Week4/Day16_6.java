package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Day16_6 {
//���� ���� �־���
	//�� ������ �ѷ� �ɰ��� ������ �ڸ��� ���� �����Ͽ� ���Ѵ�
	//�� ���� ���� ������ ���� ���� 1�� �ɶ����� �ݺ�
	//���� ���� 1�̸� break -> true��ȯ
	//���� ���� 1�� �ƴϸ� false ��ȯ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();//�ѹ� �Է¹ޱ�
	
		int check=0;
		

		
		while(num>3) {
			int sum=0;
			ArrayList <Integer> arr = new ArrayList<>();
			arr.add(num%10);//ó�� ���� 10�� �ڸ� ������ �ڸ���
			num = num/10;
		
		for(int i=0; i<arr.size(); i++) {
			sum += arr.get(i)*arr.get(i);
			
		}
		if(sum==1) {
			check=1;
			break;
		}
		num = sum;
		}
		if(check==1) {
		System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		}
}
