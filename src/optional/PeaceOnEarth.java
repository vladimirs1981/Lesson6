package optional;

import java.util.ArrayList;
import java.util.Objects;

public class PeaceOnEarth {
	public static void main(String[] args) {
		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');

		/* TODO: Remove the hash symbols and print out the truth. */
		for (int i = 0; i < truth.size(); i++) {
			if (Objects.equals('#', truth.get(i))) {
				truth.remove(i);
				i--;
			}
		}
		System.out.println(truth.toString());
	}
}
