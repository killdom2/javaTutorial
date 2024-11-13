package lambda;

public class SimpleLambdaExample {

    static void def(Int i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> 18);
    }
}

interface Int {
    int abc();
}
