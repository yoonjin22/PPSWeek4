package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Day16_7 {
//배열 두개 주어짐
	//num1의 배열을 기준으로 num2에 같은 숫자 있으면 연결
	//연결할시에 num2[i]에서 i의 값이 이전에 연결된 i의 값보다 커야 함
	//연결이 된경우의 수를 count해야함
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,7,1,7,5));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,9,2,5,1));
		int count =0;
		int n =-1;
		for(int i=0; i<list1.size(); i++) {
			if(list2.indexOf(list1.get(i))!=-1) {//리스트2에서 get1의 값을 찾은경우
				if(n<list2.indexOf(list1.get(i))) {//리스트2의 배열위치가 이전에 연결지점보다 클경우 count함
				count++;
				n = list1.indexOf(list1.get(i));
				}
			}
		}
		
		System.out.println(count);
		
	}
}
