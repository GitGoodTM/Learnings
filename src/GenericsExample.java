import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        /* It is a concept where we can write a class, interface or method
        * that is compatible with different data types
        * <T> type parameter (placeholder that gets replaced with a real type)
        * <String> type argument (Specifies the type)
        * */

        Box<String> stringBox = new Box<>();
        stringBox.setThing("thing stores string");
        Box<Integer> intBox = new Box<>(); // cannot use primitive int
        intBox.setThing(10);
        Box<Double> doubleBox = new Box<>(); // cannot use primitive double
        doubleBox.setThing(3.14);

        System.out.println("What's in the box?");
        System.out.println("'stringBox' "+ stringBox.getThing());
        System.out.println("'intBox' thing stores int: "+ intBox.getThing());
        System.out.println("'doubleBox' thing stores Pi (double): " + doubleBox.getThing());

        //Generic classes can have multiple unknown datatypes, "<T, U>"

        String item = "Lays";
        Double price = 10.0;

        Product<String,Double> product1 = new Product<>(item, price);
        product1.getProduct();

    }
}
