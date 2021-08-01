package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Day16_6 {
//먼저 정수 주어짐
	//그 정수를 둘로 쪼개서 각각의 자리의 수를 제곱하여 더한다
	//그 합한 값을 가지고 합한 값이 1이 될때까지 반복
	//합한 값이 1이면 break -> true반환
	//합한 값이 1이 아니면 false 반환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();//한번 입력받기
	
		int check=0;
		

		
		while(num>3) {
			int sum=0;
			ArrayList <Integer> arr = new ArrayList<>();
			arr.add(num%10);//처음 수를 10의 자리 단위로 자르기
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
