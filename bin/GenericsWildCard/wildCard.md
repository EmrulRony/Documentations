## Wildcard in Generics

In Java Generics there is a question mark (?) known as wildcard. Wild card represents an unknown type. The use of wildcard is to control the type safety of the generic type. In other word it restricts the unknown type to be a specific type. To be said, wildcard describes a family of types.

Three types of wildcards in Java

1. Unbounded wildcard  
2. Upper bounded type " <? extends Type> "
   Describes the family of all types that are subtype of 'Type', including the type 'Type'.
3. Lower bounded type " <? super Type> "
   Describes the family of all types that are super type of 'Type', including the type 'Type'.

**Unbounded type** < ? >

It stands for the family of all types.

```java
public class UnboundedType{

    public static void printCollection(Collection<?> collection){
        for(Object obj : collection){
            System.out.print(obj+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ArrayList<Integer> objInt = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        ArrayList<String> objStr = new ArrayList<>(Arrays.asList("Three","Four","Six","Seven","eight"));
        ArrayList<Double> objDou = new ArrayList<>(Arrays.asList(3d,4d,5d,6d,7d));
        ArrayList<Object> obj = new ArrayList<>(Arrays.asList(3d,4d,5d,6d,7d));
        printCollection(objInt); // Works
        printCollection(objStr); // Works
        printCollection(objDou); // Works
        printCollection(obj); // Works
        
    }
}   
```

In the above example `printCollection(Collection<?> collection)` can hold any type of Collection object as a parameter as the parameter is unbounded type. This type of wildcard is used in the method when type is unknown.

**Upper bounded type** " <? extends Type> "
Describes the family of all types that are subtype of 'Type', including the type 'Type'

```java
public class UpperBoundedWildCard{

    public static void printCollection(Collection<? extends Number> value){ 
		// Works for Collection of Number and all the classes that extends number
        for (Number num : value){
            System.out.print(num+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        printCollection(new ArrayList<Integer>(Arrays.asList(2,3,4,5,6))); 
		// Works : Integer is a subtype of Number
        printCollection(new ArrayList<Double>(Arrays.asList(2.12d,3.12d,4.22d,5d,6d))); 		// Works: Double is subtype of Number 
        printCollection(new ArrayList<Float>(Arrays.asList(2.1f,3f,4f,5.2f,6f))); 
		// Works: Float is subtype of Number
         printCollection(new ArrayList<String>(Arrays.asList("One","Two", "Three"))); 
		// Error : String is not a subtype of Number 
    }
}      
```

For example in `printCollection(Collection<? extends Number> value)` method, only those type of Collection objects can be passed as an argument who are either `Number` type or subtypes of Number like Integer, Double, Float. This type of wild card is mostly used for read purpose when object type is partially known.

**Lower bounded type** " <? super Type> "
Describes the family of all types that are super type of 'Type', including the type 'Type'.

```java
public class LowerBoundedWildCard{
    
    public static void printCollection(Collection<? super Integer> value){ 
		// Works for Collection of Integer and it's super classes like Number and Object
        for (Object obj : value){
            System.out.println(obj + " ");
        }
        System.out.println(" ");
    }

    public static void addToCollection(Collection<? super Integer> value){
        for (int i=1; i<=10; i++){
            value.add(i);
        }
        printCollection(value);
    }
    public static void main(String[] args) {

        addToCollection(new ArrayList<Integer>( Arrays.asList(1,2,3,4,5))); 
		// Works : Integer is a super type of Integer
        addToCollection(new ArrayList<Number>( Arrays.asList(1,2,3,4,5))); 
		// Works : Number is a super type of Integer
        addToCollection(new ArrayList<Object>( Arrays.asList(1,2,3,4,5))); 
		// Works : Object is a super type of Number and Integer
        addToCollection(new ArrayList<Double>( Arrays.asList(1,2,3,4,5))); 
		// Error: Double is not a super type of Integer
    }
}        
```

Say, in `addToCollection(Collection<? super Integer> value)` method only those type of objects of Collection can be passed who are either `Integer` type of super type of Integer like `Number`, `Object`.
Lower bounded wildcards are mostly used for read purpose.