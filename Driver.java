import java.util.ArrayList;
import java.util.Random;

public class Driver {
	
	// A method to return a new array
	// with all the same values as the argument
	// array, but in new random order.
	// Argument array is unchanged.
	public static int[] randomize(int[] arr) {
		Random random = new Random();
		int[] newArr = new int[arr.length];
		ArrayList<Integer> ls = new ArrayList<>();
		int rand = random.nextInt(arr.length);
		int count = arr.length;
		
		while(count > 0) {
			ls.add(rand);
			count--;
			while(ls.contains(rand)) {
				rand = random.nextInt(arr.length);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			newArr[ls.get(i)] = arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		
		int[] a = {3,6,7,3,4,7};
		a = randomize(a);
		for(int i : a) {
			System.out.print(i + " ");
		}

	}

}