package COM;

//public class MergeSortedArray {
//	public static int[] mergeArrays(int[] arr1, int[] arr2) {
//		int m = arr1.length;
//		int n = arr2.length;
//		int[] mergedArray = new int[m + n];
//
//		int i = 0, j = 0, k = 0;
//
//		while (i < m && j < n) {
//			if (arr1[i] <= arr2[j]) {
//				mergedArray[k++] = arr1[i++];
//			} else {
//				mergedArray[k++] = arr2[j++];
//			}
//		}
//
//		while (i < m) {
//			mergedArray[k++] = arr1[i++];
//		}
//
//		while (j < n) {
//			mergedArray[k++] = arr2[j++];
//		}
//
//		return mergedArray;
//	}
//
//	public static void main(String[] args) {
//		int[] arr1 = { 4, 9, 12, 13 };
//		int[] arr2 = { 3, 6, 8, 10, 15, 16 };
//
//		int[] merged = mergeArrays(arr1, arr2);
//
//		// Print the merged array
//		System.out.println("Merged Array:");
//		for (int num : merged) {
//			System.out.print(num + " ");
//		}
//	}
//} 
//	public class MergeSortedArray {
//	    public static int[] mergeArrays(int[] arr1, int[] arr2) {
//	        int m = arr1.length;
//	        int n = arr2.length;
//	        int[] mergedArray = new int[m + n];
//
//	        int i = 0, j = 0, k = 0;
//
//	        while (i < m || j < n) {
//	            if (i < m && (j >= n || arr1[i] <= arr2[j])) {
//	                mergedArray[k++] = arr1[i++];
//	            } else {
//	                mergedArray[k++] = arr2[j++];
//	            }
//	        }
//
//	        return mergedArray;
//	    }
//
//	    public static void main(String[] args) {
//	        int[] arr1 = {4, 9, 12, 13};
//	        int[] arr2 = {3, 6, 8, 10, 15, 16};
//
//	        int[] merged = mergeArrays(arr1, arr2);
//
//	        // Print the merged array
//	        System.out.println("Merged Array:");
//	        for (int num : merged) {
//	            System.out.print(num + " ");
//	        }
//	    }
//	}

public class MergeSortedArray {
	static int[] merge(int[] arr1,int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
		int l=0,r=0,i=0;
		while(l<arr1.length &&r<arr2.length) {
			if(arr1[l]<arr2[r]) {
				arr3[i]=arr1[l];
				l++;
			}
			else {
				arr3[i]=arr2[r];
				r++;
			}
			i++;
		}
		if(r<arr2.length) {
			while(r<arr2.length) {
				arr3[i]=arr2[r];
				i++;
				r++;
			}
		}else {
			while(r<arr1.length) {
				arr3[i]=arr1[i];
				i++;
				l++;
			}
		}
		return arr3;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {4, 9, 12, 13};
        int[] arr2 = {3, 6, 8, 10, 15, 16};
        int[] ans=merge(arr1,arr2);
        for(int element:ans) {
        	System.out.print(element+" ");
        }
        
	}
}


