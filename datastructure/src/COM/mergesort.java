package COM;

public class mergesort {
	static void merge(int[] arr,int l,int m,int h) {
		int[] L=new int[m-l+1];   //creating the left sub array
		int[] R=new int[h-m];     //creating the right sub array
		int k=l;
		//adding the data inside left sub array
		for(int i=0;i<R.length;i++) {
			R[i]=arr[k];
			k++;
		}
		k=l;
		int i=0,j=0;
		//merge the data
		while(i<L.length&&j<R.length) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				k++;i++;
			}
			else {
				arr[k]=R[j];
				k++;j++;
			}
		}
		//to add remaining data
		while(i<L.length) {
			 arr[k]=L[i];
			 k++;i++;
		}
		while(j<R.length) {
			arr[k]=R[j];
			k++;j++;
		}
	}
	static void sort(int[] arr,int l,int h) {
		if(l<h) {
			int mid=(l/h)/2;
			sort(arr,1,mid);//left sub array
			sort(arr,mid+1,h);//right sub array
			merge(arr,l,mid,h);
		}
	}
	public static void main(String[] args) {
		int[] arr={7,44,6,9,245,99,12,24,35,58};
		sort(arr,0,arr.length-1);
		for(int ele:arr) {
			System.out.println(ele+" ");
		
		}
	}
}
