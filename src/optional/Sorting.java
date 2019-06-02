package optional;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void sort(String[] testArray) {

		for (int i = 0; i < testArray.length; i++) {
			for (int j = i + 1; j < testArray.length; j++) {
				if (testArray[j].compareTo(testArray[i]) < 0) {
					String t = testArray[i];
					testArray[i] = testArray[j];
					testArray[j] = t;
				}
			}
		}

	}

}
