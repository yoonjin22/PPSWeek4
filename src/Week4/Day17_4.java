package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Day17_4 {
//string 2���� �־��� 
	//s�� t�� ������ �־���
	//���ο� ���ĺ��� �߰��ȰŸ� false��ȯ
	//���ĺ����� ������ �ٲ�Ÿ� true��ȯ
	public static boolean main(String[] args) {
		
		String s = "anagram";
		String[] array = s.split("");
		ArrayList list1 = new ArrayList(Arrays.asList(array));
		
		String t = "nagaram";
		String[] array2 = t.split("");
		ArrayList list2 = new ArrayList(Arrays.asList(array2));
		

		boolean result;
		while(true) {
			if(s.length()!=t.length()) {
				result = false;
				System.out.println(result);
			return false;
			}
			for(int i=0; i<s.length(); i++){
				for(int j=0; j<t.length();j++) {
					if(list2.contains(list1.get(i))){
						list2.remove(list1.get(i));
					}
						else {
							result = false;
							System.out.println(result);
							return false;
						}	
					
					
				}
			}
			break;
			
		}
	
		result = true;
		System.out.println(result);
		return true;
		
	}
}
