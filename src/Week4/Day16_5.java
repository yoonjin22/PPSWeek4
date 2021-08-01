package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day16_5 {
//ArrayList 하나 주어지고
	//더해서 나와야할 target값도 주어짐
	//배열 형태로해당 인덱스를 반환함 (i+1)번째 로다가

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>(Arrays.asList(3,3) );
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		ArrayList <Integer> num= new ArrayList<>();
		int total = 0;
		
		for(int i=0; i<list.size(); i++) {
			for(int j=1;j<list.size(); j++) {
			if(target-list.get(i)==list.get(j)) {
				num.add(i);
				num.add(j);
				System.out.println(num);
				return;
			}
		}
	}
		
}
}
