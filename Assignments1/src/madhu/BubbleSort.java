package madhu;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array:"+Arrays.toString(arr));
		int len = arr.length;
		for (int i = 0; i < len-1;i++) {
			for (int j = 0;j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					
				}
			}
			
		}
		System.out.println("Sorted array is:"+Arrays.toString(arr));


	}

}
