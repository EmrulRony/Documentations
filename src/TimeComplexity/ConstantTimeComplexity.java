package TimeComplexity;


public class ConstantTimeComplexity{
    public int func(int input){
        int total = 0;
        for (int i=1; i<=input; i++){
            for (int j=input; j>=i ; j--){
                total +=i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(new ConstantTimeComplexity().func(5));
    }
}