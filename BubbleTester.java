import java.util.Arrays;
import java.util.Random;

public class BubbleTester {
	private static boolean DEBUG = false;

	public static void main(String[] args) {

		manualEvaluation();

		boolean failure = false;
		failure = seededRandomSort(1000, 1000);
		failure = seededRandomSort(10, 1) || failure;
		failure = seededRandomSort(10, 0) || failure;
		failure = seededRandomSort(10, 2) || failure;

		TesterMethods.overall(failure);
	}

	public static void manualEvaluation() {
		TesterMethods.tester("manualEvaluation");

		TesterMethods.tester("expectedPrints EXPECTS YOU TO PRINT PER SORT CYCLE");
//		Sorts.main(new String[1]);

		int[][] sorts = {
			{5, 1, 12, -5, 16},
			{2, 3, 4, 5, 1},
			{6, 1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{},
			{0},
			{5, 4, 3, 2, 1},
		};

		int[][][] expectedPrints = {
			{
				{5, 1, 12, -5, 16},
				{1, 5, -5, 12, 16},
				{1, -5, 5, 12, 16},
				{-5, 1, 5, 12, 16}
			},
			{
				{2, 3, 4, 5, 1},
				{2, 3, 4, 1, 5},
				{2, 3, 1, 4, 5},
				{2, 1, 3, 4, 5},
				{1, 2, 3, 4, 5}
			},
			{
				{6, 1, 2, 3, 4, 5},
				{1, 2, 3, 4, 5, 6}
			},
			{
				{1, 2, 3, 4, 5},
			},
			{
				{}
			},
			{
				{0}
			},
			{
				{5, 4, 3, 2, 1},
				{4, 3, 2, 1, 5},
				{3, 2, 1, 4, 5},
				{2, 1, 3, 4, 5},
				{1, 2, 3, 4, 5}
			}
		};

		for (int test = 0; test < sorts.length; test++) {
			System.out.println("bubblePrint");
			Sorts.bubbleSort(sorts[test]);

			System.out.println("expectedPrints");
			for (int line = 0; line < expectedPrints[test].length; line++) {
				System.out.println(Arrays.toString(expectedPrints[test][line]));
			}

			if (Arrays.equals(expectedPrints[test][expectedPrints[test].length-1], sorts[test])) {
				TesterMethods.passMessage(test);
			} else {
				TesterMethods.errorMessage(test, Arrays.toString(expectedPrints[test][expectedPrints[test].length-1]), Arrays.toString(sorts[test]));
			}
		}

		System.out.println("expectedPrints EVALUATE YOURSELF");
	}

	public static boolean seededRandomSort(int tests, int arrLen) {
		TesterMethods.tester("seededRandomSort");
		boolean fail = false;

		for (int test = 0; test < tests; test++) {
			Random rng = new Random(test);
			int[] sort = new int[arrLen];
			int[] expected = new int[arrLen];

			for (int i = 0; i < arrLen; i++) {
				int val = rng.nextInt(arrLen) - arrLen / 2;
				sort[i] = val;
				expected[i] = val;
			}

			if (DEBUG) {
				System.out.println(Arrays.toString(sort));
				System.out.println(Arrays.toString(expected));
			}

			Sorts.bubbleSort(sort);
			Arrays.sort(expected);

			if (DEBUG) {
				System.out.println(Arrays.toString(sort));
				System.out.println(Arrays.toString(expected));
			}

			if (Arrays.equals(sort, expected)) {
				if (DEBUG) {
					TesterMethods.passMessage(test);
				}
			} else {
				fail = true;
				TesterMethods.errorMessage(test, Arrays.toString(expected), Arrays.toString(sort));
			}
		}

		TesterMethods.methodMessage("seededRandomSort", fail);
		return fail;
	}
}
