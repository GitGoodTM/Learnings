public class Square extends Shape{

    // child class extending abstract class
    double side;

    Square(double side) { // constructor
        super("Square");
        this.side=side;
    }

    @Override
    double area() { // abstract method inside the abstract class
                    // is mandatory to be implemented inside it's child class
        return side*side;
    }
}
