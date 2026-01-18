import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        Random random = new Random();
        int number;
        number=random.nextInt();
        System.out.println(number);
        number= random.nextInt(1,7);
        System.out.println(number);
    }
}
