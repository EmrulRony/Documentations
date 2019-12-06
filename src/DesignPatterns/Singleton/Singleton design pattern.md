### Singleton design pattern

In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time. After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance created.

```java
 class SingletonClass {
	private static SingletonClass obj;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance(){
		if(obj!=null)
			return obj;
		else
			obj=new SingletonClass();
		return obj;
	}
}

class SingletonDesignPattern{
	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj1 = SingletonClass.getInstance();
		
		System.out.println(obj==obj1); // Output: true
	}
}
```

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

