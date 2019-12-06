package GenericsWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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