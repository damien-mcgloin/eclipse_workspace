package payroll;

public class ShapeFactory {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(3);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(5);
		
		Triangle triangle = new Triangle();
		triangle.setBase(5);
		triangle.setHeight(5);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = circle;
		shapes[1] = rectangle;
		shapes[2] = triangle;
		
		calculateArea(shapes);
		
	}

	public static void calculateArea(Shape[] shapes) {
		for (Shape s : shapes) {
			s.area();
		}

	}

}
