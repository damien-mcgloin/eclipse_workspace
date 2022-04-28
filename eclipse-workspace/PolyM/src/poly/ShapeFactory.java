package poly;

public class ShapeFactory {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(3.3);
		circle.area();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(2);
		rectangle.setWidth(5);
		rectangle.area();
		
		Triangle triangle = new Triangle();
		triangle.setBase(3);
		triangle.setHeight(4);
		
		getAreaOfShape(rectangle);
		getAreaOfShape(circle);
		getAreaOfShape(triangle);

	}
	
	public static void getAreaOfShape(Shape shape) {
		shape.area();
	}
	
	

}
