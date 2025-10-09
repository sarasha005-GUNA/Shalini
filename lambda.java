package project;

@FunctionalInterface
interface Contract {
    void rule1(int a,int b);  // Only one abstract method
}

public class lambda {
    public static void main(String[] args) {
        Contract ci = (a,b) -> {
            System.out.println(a+b);
        };
        ci.rule1(3,5);
    }
}