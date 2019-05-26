package exercises;


/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints “Hanging a red ornament”, etc.
 */

public class Ornament {

	String color;

	public Ornament(String color) {
		super();
		this.color = color;
	}

	public void hang() {
		System.out.println("hanging a " + this.color + " ornament");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color;
	}

}
