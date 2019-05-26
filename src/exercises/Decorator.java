package exercises;

import java.awt.Color;
import java.util.ArrayList;

public class Decorator {
	public static void main(String[] args) {
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
		boxOfDecorations.add(new Ornament("black"));
		boxOfDecorations.add(new Ornament("blue"));
		boxOfDecorations.add(new Ornament("green"));
		boxOfDecorations.add(new Ornament("orange"));
		boxOfDecorations.add(new Ornament("red"));
		boxOfDecorations.add(new Ornament("pink"));

		for (Ornament ornament : boxOfDecorations) {
			ornament.hang();
		}

	}

}
