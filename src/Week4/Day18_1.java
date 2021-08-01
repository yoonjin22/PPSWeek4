package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day18_1 {
//int n의 값이 첫째줄에 주어졌을때
	//0부터 n까지를 모두 각각 2진수로 나타내려한다
	//그경우에 각각 가지고 있는 1의 개수를 나타내는 배열 만들기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		//받아낸 n값을 가지고 0부터 n까지 이진수로 나타내는 메소드와
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
		//나타낸 값을 가지고 1의 개수를 각각 배열원소로 추가하기
		
	}
}
