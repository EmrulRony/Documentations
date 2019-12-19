package InnerClassesInJava;


interface Fruit{
    void bug();
}

public class AnonymousInnerClass{
    public static void main(String[] args) {

        Fruit mango = new Fruit(){
        
            @Override
            public void bug() {
                System.out.println("Mango has bug");
            }
        };
        mango.bug();
    }
}