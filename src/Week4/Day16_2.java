package Week4;

import java.util.ArrayList;
import java.util.Arrays;

//�迭������ ���̸� n�̶��ϰ� 
//�迭���� ���ҵ��� 1���� n������ ���� �������� �ʴ� ���� ������ �װ��� ��ȯ�Ѵ�.
public class Day16_2 {
	
	public static void main(String[] args) {
		int[] nums = {1,1};
		int size = nums.length;
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1));
		
		ArrayList<Integer> find = new ArrayList<>();
		for(int i=0; i<size; i++) {
			if(list.indexOf(i+1)==-1)
				find.add(i+1);
				
		}
		System.out.println(find);
	}

}
