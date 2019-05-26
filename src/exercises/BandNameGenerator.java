package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {

	public static void main(String[] args) {

		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("slimy");
		adjectives.add("blind");
		adjectives.add("greasy");
		adjectives.add("bloody");
		adjectives.add("horny");

		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("pants");
		nouns.add("bones");
		nouns.add("eyes");
		nouns.add("teeth");
		nouns.add("nails");

		int idx = new Random().nextInt(adjectives.size());
		int idx1 = new Random().nextInt(nouns.size());
		System.out.println(adjectives.get(idx) + " " + nouns.get(idx1));

	}

}
