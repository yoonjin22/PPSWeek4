package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



//오름차순으로 정렬 (작-> 큰)
//정수유형의sum이라는 배열을 만듦 
//그 배열의 원소는 주어진 num1배열의 각각 i번째까지의 값들을 더한 값이다
//나중에 total 출력

public class Day17_9 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		ArrayList<Integer> num1 = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
		num1.add(scanner.nextInt());
		}
		
		Collections.sort(num1);//오름차순 정렬
		
		int total=0;
		ArrayList<Integer> sum = new ArrayList<>();
		for(int n = 0; n<num; n++) {
			total +=(num-n)*num1.get(n);
		}
		System.out.println(total);
		
		
		
	}
}
