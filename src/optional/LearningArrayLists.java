package optional;

import java.util.ArrayList;
import java.util.Iterator;

public class LearningArrayLists {

	public static ArrayList<Object> arraylist = new ArrayList<Object>();

	public static Object createArrayList() {

		ArrayList<Object> arraylist = new ArrayList<Object>();
		return arraylist;
	}

	public static void addToArrayList(ArrayList arraylist, String string) {

		arraylist.add(string);

	}

	public static Object getNumberOfItems(ArrayList arraylist) {
		// TODO Auto-generated method stub
		return arraylist.size();
	}

	public static Object getItem(ArrayList arrayList, int i) {
		return arrayList.get(i);
	}

	public static String iterateOver(ArrayList arrayList) {
		String s = "";
		Iterator<String> iter = arrayList.iterator();
		while (iter.hasNext()) {
			s = s + iter.next();

		}
		return s;

	}

	public static Object findItemOnList(ArrayList arrayList, String string) {

		return arrayList.indexOf(string);
	}

	public static void replaceItem(ArrayList arrayList, int i, String string) {

		arrayList.set(i, string);

	}

	public static void insertItem(ArrayList arrayList, int i, String string) {

		arrayList.add(i, string);

	}

	public static ArrayList<Integer> createTypedArrayList() {

		return new ArrayList<Integer>();
	}

	public static Object addAllInteger(ArrayList<Integer> arrayList) {
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}

		return sum;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> arrayList) {
		String s = "";
		Iterator<String> iter = arrayList.iterator();
		while (iter.hasNext()) {
			s = s + iter.next();

		}
		return s;

	}

}
