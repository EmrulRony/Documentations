package DesignPatterns.Factory;

public class MainClass {
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape(Shapes.RECTANGLE);
		
		if (shape!=null) {
			shape.draw();
		}
		else
			System.out.println("Shape not found!!");
	}
}
