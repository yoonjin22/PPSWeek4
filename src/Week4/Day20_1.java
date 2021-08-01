package Week4;

public class Day20_1 {
	 public boolean isIsomorphic(String sString, String tString) {

	        char[] s = sString.toCharArray();
	        char[] t = tString.toCharArray();

	        int length = s.length;
	        if(length != t.length) return false;
			//ASCII 문자 256을 담을 수 있는 char array
	        char[] sm = new char[256];
	        char[] tm = new char[256];
			
	        for(int i=0; i<length; i++){
	            char sc = s[i];
	            char tc = t[i];
	            if(sm[sc] == 0 && tm[tc] == 0){
	            	//없는 문자라면 문자 ASCII 번호를 index 로 하는 배열에 char 을 저장
	                sm[sc] = tc;
	                tm[tc] = sc;
	            }else{
	            	//있는 문자라면
	                if(sm[sc] != tc || tm[tc] != sc){
	                	//s와 t 서로 다른 대응되는 문자가 있을 경우
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
