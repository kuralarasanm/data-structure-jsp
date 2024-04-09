package COM;

public class IsomorphicStrings {

	static String countsqFreq(String s) {
    	s=s+" ";
    	String ans="";
    	int c=1;
    	for(int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i)==s.charAt(i+1)) {
    			c++;
    		}else {
    			ans=ans+c;
    			c=1;
    		}
    	}
    	return ans;
    }
    public static void main(String[] args) {
        String s1="aabcc";
        String s2="xxyzz";
        if(countsqFreq(s1).equals(countsqFreq(s2))) {
        	System.out.println("isomarphic");
        }else {
        	System.out.println("not isomarphic");
        }
    }
}

