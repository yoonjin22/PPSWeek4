package Week4;

public class Day20_1 {
	 public boolean isIsomorphic(String sString, String tString) {

	        char[] s = sString.toCharArray();
	        char[] t = tString.toCharArray();

	        int length = s.length;
	        if(length != t.length) return false;
			//ASCII ���� 256�� ���� �� �ִ� char array
	        char[] sm = new char[256];
	        char[] tm = new char[256];
			
	        for(int i=0; i<length; i++){
	            char sc = s[i];
	            char tc = t[i];
	            if(sm[sc] == 0 && tm[tc] == 0){
	            	//���� ���ڶ�� ���� ASCII ��ȣ�� index �� �ϴ� �迭�� char �� ����
	                sm[sc] = tc;
	                tm[tc] = sc;
	            }else{
	            	//�ִ� ���ڶ��
	                if(sm[sc] != tc || tm[tc] != sc){
	                	//s�� t ���� �ٸ� �����Ǵ� ���ڰ� ���� ���
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
