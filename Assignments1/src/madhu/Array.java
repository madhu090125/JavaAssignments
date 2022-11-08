package madhu;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		int value = 19;
		boolean check = false;
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array:"+Arrays.toString(arr));
for(int element : arr) {
	if(element == value) {
		check = true;
		System.out.println("True");

	}	
}

	}

}
