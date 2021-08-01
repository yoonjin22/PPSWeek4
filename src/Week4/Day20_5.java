package Week4;

public class Day20_5 {
	public int firstUniqChar(String s) {
        char[] alpha = new char[26];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int num = c - 97;
            alpha[num]++;
        }
        
        for(int i=0; i<s.length(); i++) {
            if(alpha[s.charAt(i)-97] == 1)
                return i;
        }
        return -1;
    }
}
