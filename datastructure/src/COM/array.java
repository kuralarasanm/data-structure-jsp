package COM;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] arr= {2,3,5,1,8,12,5,7,5};
		int target=10;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println(arr[i]+" "+arr[j]);
//				}
//			}
//		}
		
		Arrays.sort(arr);
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				System.out.println(arr[i]+" "+arr[j]);
				i++;j--;
			}
			else if(arr[i]+arr[j]>target) {
				j--;
			}
			else {
				i++;
			}
		}
	}
}
