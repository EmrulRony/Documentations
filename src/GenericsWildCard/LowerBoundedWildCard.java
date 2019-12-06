package GenericsWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class LowerBoundedWildCard{
    
    public static void printCollection(Collection<? super Integer> value){ // Works for Collection of Integer and it's super classes like Number and Object
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

        addToCollection(new ArrayList<Integer>( Arrays.asList(1,2,3,4,5))); // Works : Integer is a super type of Integer
        addToCollection(new ArrayList<Number>( Arrays.asList(1,2,3,4,5))); // Works : Number is a super type of Integer
        addToCollection(new ArrayList<Object>( Arrays.asList(1,2,3,4,5))); // Works : Object is a super type of Number and Integer
        // addToCollection(new ArrayList<Double>( Arrays.asList(1,2,3,4,5))); // Error: Double is not a super type of Integer
    }
}