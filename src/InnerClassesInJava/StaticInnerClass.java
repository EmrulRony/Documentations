package InnerClassesInJava;


class Calculator{
    int x,y;
    double sum;

    static enum Methods{
        Add, Sub, Mult, Div
    }
}

interface Calculation{
    double calculate(int x, int y, String str);
}
public class StaticInnerClass{
    public static void main(String[] args) {
        Calculation calc = new Calculation(){
        
            @Override
            public double calculate(int x, int y, String str) {
                if (str.equals("Add")){
                    return x+y;
                }
                else if (str.equals("Sub")){
                    return (x-y);
                }
                else if (str.equals("Mult") ) return x*y;
                else return x/y;
            }
        };

        System.out.println(calc.calculate(1, 2, Calculator.Methods.Add.toString()));
    }
}