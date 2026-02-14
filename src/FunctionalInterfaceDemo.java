public class FunctionalInterfaceDemo{

    public static void main(String[] args) {
        FunctionalInterface fiDemoObj = i -> {
            System.out.println("We are inside an anonymous class which extends the 'FunctionalInterface'");
            System.out.println("Assigned using Lambda expression");
            System.out.println("The value of i being passed is: " + i);
        };
        fiDemoObj.show(5);
    }
}
