package Week4;

import java.util.ArrayList;
import java.util.List;

public class Day20_3 {
	 private static byte[] keyBoard = new byte[]{
	            1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2,
	            4,4,4,4,4,4,
	            1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2
	    };
	 
	 
	    public String[] findWords(String[] words) {
	        List<String> result = new ArrayList<>();
	        int tmp;
	        boolean flag;
	        for(String word : words) {
	            tmp = keyBoard[word.charAt(0) - 'A'];
	            flag = true;
	            for(char c:word.toCharArray()) {
	                if(tmp != keyBoard[c - 'A']) {
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag) {
	                result.add(word);
	            }
	        }
	        return result.toArray(new String[result.size()]);
	    }

}
