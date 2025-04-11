import java.util.Arrays;

public class DSA9 {
	public static int[] merge(int[] a,int[] b) {
		int[] sol = new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				sol[k++]=a[i++];
			}else {
				sol[k++]=b[j++];
			}
		}
		while(i<a.length) 	sol[k++]=a[i++];
		while(j<b.length) 	sol[k++]=b[j++];
		
		return sol;
	}
	public static void main(String[] args) {

	    int[] arr1 = {1, 3, 5};
	    int[] arr2 = {2, 4, 6};

	    System.out.println(Arrays.toString(merge(arr1, arr2)));

	}
}
