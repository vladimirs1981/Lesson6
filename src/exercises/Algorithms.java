package exercises;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean oyst = oysters.get(i);
			if (oyst == true) {
				pearls++;

			}

		}
		return pearls;
	}

	static double findTallest(List<Double> peeps) {

		double max = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > max) {
				max = peeps.get(i);
			}
		}

		return max;
	}

	static String findLongestWord(List<String> words) {

		String longestWord = words.get(0);
		int x = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
				x = i;
			}
		}

		return words.get(x);
	}

	static boolean containsSOS(List<String> message1) {

		for (int i = 0; i < message1.size(); i++) {
			String mess1 = message1.get(i);
			if (mess1.contains("... --- ...")) {
				return true;
			}

		}
		return false;
	}

	static List<Double> sortScores(List<Double> results) {

		Collections.sort(results);
		return results;
	}

//	static sortDNA(List<String> unsortedSequences) {
//		
//	
//		Collections.sort(unsortedSequences);
//		if (unsortedSequences.containsAll(sortedSequences)) {
//			return sortedSequences;
//		}
//		return null;
//		
//		
//	}
//
//	public static List<String> sortWords(List<String> words) {
//
//		
//		    for (int i = 0; i < words.size(); i++) {
//		        for (int j = i + 1; j < words.size(); j++) {
//		            if (words.get(i).compareTo(words.get(j)) > 0) {
//		                String temp = words.get(i);
//		      
//		            }
//		        }
//		    }
//
//		    return words;
		
//	}

}
