import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PracticeProblem {

	public static int[] recaman(int n) {
		if (n <= 0) {
			return new int[0];
		}
		int[] array = new int[n];
		Set<Integer> set = new HashSet<>();
		recamanHelper(1, 0, array, set, n);
		return array;
	}

	private static void recamanHelper(int i, int prev, int[] array, Set<Integer> set, int n) {
		if (i > n) {
			return;
		}
		int next = prev - i;
		if (next <= 0 || set.contains(next)) {
			next = prev + i;
		}
		array[i - 1] = next;
		set.add(next);
		recamanHelper(i + 1, next, array, set, n);
	}
	
	public static void main(String args[]) {
		int[] result = recaman(6);
		System.out.println(Arrays.toString(result));

	}

	

}
