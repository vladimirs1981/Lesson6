package optional;

import java.util.ArrayList;
import java.util.Random;

/* Burst an ArrayList by putting so many things into it that you cause an OutOfMemory error. */

public class ArrayOverload {

	public static void main(String[] args) {

		ArrayList<Integer> burst = new ArrayList<Integer>();

		Random r = new Random();

		while (true) {

			burst.add(r.nextInt());
		}
	}

}
