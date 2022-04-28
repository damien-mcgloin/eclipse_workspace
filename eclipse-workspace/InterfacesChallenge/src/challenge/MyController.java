package challenge;

import java.util.Random;

/**
 * Class with the main method
 * 
 * @author aidan mcgowan
 */
public class MyController {

	private static final int NUMBER_OF_SHAPES = 10;

	/**
	 * Ad hoc test of the interface and classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// array to hold shapes of all three types
		IMyShape myShapes[] = new IMyShape[NUMBER_OF_SHAPES];

		// create the shapes
		generateShapes(myShapes);

		// display the names, areas and perimeters of shapes in array - note use of
		// programming to an interface
		displayShapeInfo(myShapes);

	}

	/**
	 * Generates random shapes and adds to array of IMyShapes
	 * 
	 * @param shapes
	 */
	private static void generateShapes(IMyShape[] shapes) {
		// create random number generator
		Random generator = new Random();

		// randomly create the shapes and store in array
		for (int loop = 0; loop < shapes.length; loop++) {
			// switch on a number between 0 - 2 (inclusive)
			switch (generator.nextInt(3)) {
			case 0:
				shapes[loop] = new MyCircle(generator.nextDouble() * (generator.nextInt(10) + 1));
				break;
			case 1:
				shapes[loop] = new MySquare(generator.nextDouble() * (generator.nextInt(10) + 1));
				break;
			case 2:
				shapes[loop] = new MyRectangle(generator.nextDouble() * (generator.nextInt(10) + 1),
						generator.nextDouble() * (generator.nextInt(10) + 1));

			}
		}
	}

	/**
	 * displays all shapes
	 * 
	 * @param shapes
	 */
	private static void displayShapeInfo(IMyShape[] shapes) {
		System.out.println();
		for (IMyShape shape : shapes) {
			System.out.print(shape.getShapeName());
			System.out.printf(" Area: %.2f", shape.calculateArea());
			System.out.printf(" Perimeter: %.2f", shape.calculatePerimeter());

			if (shape instanceof MySquare) {
				MySquare square = (MySquare) shape;
				System.out.printf(" Square length %.2f", square.getLength());
			} else if (shape instanceof MyRectangle) {
				MyRectangle rectangle = (MyRectangle) shape;
				System.out.printf(" Rectangle breadth %.2f", rectangle.getBreadth());
			} else if (shape instanceof MyCircle) {
				MyCircle circle = (MyCircle) shape;
				System.out.printf(" Circle radius %.2f", circle.getRadius());
			} else {
				// nothing else to do.. shape not recognised
			}
			System.out.println();

		}
	}

}
