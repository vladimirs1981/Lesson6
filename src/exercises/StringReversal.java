package exercises;

import java.util.Arrays;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	
	
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: 
	 *       QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 *       
	 *       youtube.com/watch?v=dQw4w9WgXcQ
	 *       SouthPark fan?
	 */

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
	}

	public String reverseMe(String string) {
		
		char [] reverseDecoder = string.toCharArray();
		for (int i = 0; i < reverseDecoder.length/2; i++) {
			int j = reverseDecoder.length-i-1;
			char c = reverseDecoder[i];
			reverseDecoder[i]=reverseDecoder[j];
			reverseDecoder[j]=c;
			
		}
			System.out.println(string.valueOf(reverseDecoder));
			return String.valueOf(reverseDecoder);
			
			
		}
			
}
