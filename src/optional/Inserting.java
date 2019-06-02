package optional;

import java.util.Arrays;

import org.junit.runners.parameterized.TestWithParameters;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {

		testArray[i] = j;
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		int currentsize = orderedArray.length;
		int newSize = currentsize + 1;
		String[] tempArray = new String[newSize];
		for (int i = 0; i < currentsize; i++) {
			tempArray[i] = orderedArray[i];
		}
		tempArray[newSize - 1] = string;
		Arrays.sort(tempArray);
		return tempArray;
	}

}  
