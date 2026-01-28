public class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("Drive Car");
    }

    @Override
    void name(){
        System.out.println("You own an Alto");
    }
}
