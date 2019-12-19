package InnerClassesInJava;

// Two type of inner classes
// 1. Non static inner classes
//      -- Member Inner class 
//      -- Local Inner class 
//      -- Anonymous Inner class
// 2. Static inner classes

class OuterClass {
    private String str = "My name is Khan";
    InnerClass inner = new InnerClass();

    public void outerMet() {
        System.out.println("Inside outer met");
        System.out.println("Reaching inner member from outer "+inner.x);
    }

    class InnerClass {
        public int x = 100;
        public void innerMet() {
            System.out.println("Inside innerMet");
            System.out.println("Reaching outer from inner" + str);
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
    }
}