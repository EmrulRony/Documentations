### Factory Design Pattern

Factory design pattern falls under creational design pattern category . The purpose of factory design pattern is to create object without exposing creational logic. In this design pattern a factory class is responsible for creating object.

```java
public interface Shape {
	public void draw();
}
```

public class Triangle implements Shape{

```java
@Override
public void draw() {
	System.out.println("Drawing triangle");
 }
}
```

```java
public class Square implements Shape {
@Override
public void draw() {
	System.out.println("Drawing square...");
}
}
```

```java
public class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing rectangle...");
	}
}
```

```java
public enum Shapes {
	TRIANGLE,SQUARE,RECTANGLE;
}
```

```java
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
```

```
Output:

Drawing rectangle...
```

