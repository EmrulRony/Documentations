package GenericsWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UpperBoundedWildCard{

    public static void printCollection(Collection<? extends Number> value){ // Works for Collection of Number and all the classes that extends number
        for (Number num : value){
            System.out.print(num+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        printCollection(new ArrayList<Integer>(Arrays.asList(2,3,4,5,6))); // Works : Integer is a subtype of Number
        printCollection(new ArrayList<Double>(Arrays.asList(2.12d,3.12d,4.22d,5d,6d))); // Works: Double is subtype of Number 
        printCollection(new ArrayList<Float>(Arrays.asList(2.1f,3f,4f,5.2f,6f))); // Works: Float is subtype of Number
        // printCollection(new ArrayList<String>(Arrays.asList("One","Two", "Three"))); // Error : String is not a subtype of Number 
    }
}