package COM;

public class Selfdividingnumber {
	public static void main(String[] args) {
		int n=1224,n1=n;
		int rem=0;
		boolean flag=true;
		while(n!=0) {
			rem=n%10;
			if(n1%rem!=0){
				flag=false;
				break;
			}
			n=n/10;
		}
		System.out.println(flag==true?"yes":"no");
	}
}
