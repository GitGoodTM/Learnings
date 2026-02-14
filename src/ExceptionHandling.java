import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception handling deals with try{} catch{}, finally{}

        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter your number: ");
            inputNumber=scanner.nextInt();
            System.out.println("Try "+inputNumber+"/0: "+ (inputNumber/0));
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

        /*
        * Going deeper into this subject, there are mainly 3 types of exceptions:
        * Checked: checked at compile time; IOException, SQLException, FileNotFoundException, InterruptedException
        * must use "try/catch" or "throws" IOException
        * Unchecked: Checked at runtime, when something unexpected happens; NullPointerException, IndexOutOfBoundsException, ArithmeticException, InputMismatchException, IllegalArgumentException
        * Try to fix them instead of handling them.
        * Errors: JVM-level disasters; OutOfMemoryError, StackOverflowError
        *  */

        // All out of the box extensions like runnable, etc. which end with "-able" are interfaces
        // Only exception is Throwable being a class

        // Let's look at throw keyword, it is one way to call/trigger an exception catch even if the exception is not actually happening

        int i=0;
        int j=0;
        System.out.print("Let's try out 'throw' keyword, enter a number greater than 18: ");
        i=scanner.nextInt();
        try{
            j=18/i;
            if(j>0){throw new MyOwnException("I asked you to enter number greater than 18");}
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("Following Exception occurred: "+ e);
        }

        // Let's check out 'Throws' keyword now
        // it helps classes to escape the responsibility of handling a certain exception, to it's caller class

        DuckingExceptionExample duck = new DuckingExceptionExample();
        try {
            duck.duck();
        } catch (ClassNotFoundException e) {
            System.out.println("Inside catch for ClassNotFoundException: " + e);
            e.printStackTrace();
        }
    }
}
