package DesignPatterns.Factory;

public class ShapeFactory {
	public static Shape getShape(Shapes shapes) {
		Shape shape=null;
		switch(shapes) {
		case TRIANGLE:
			shape = new Triangle();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		}
		return shape;
	}
}
