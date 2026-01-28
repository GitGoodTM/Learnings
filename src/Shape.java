public abstract class Shape {
    // abstract class Shape, can only be called in child classes
    String type;

    Shape(String type){ // Constructor
        this.type=type;
    }

    abstract double area(); // abstract method

    void display(){ // concrete method
        System.out.println(type + " is a shape");
    }
}
