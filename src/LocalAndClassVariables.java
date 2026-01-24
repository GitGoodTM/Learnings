public class LocalAndClassVariables {

    static int x=1;

    void main(){

        int x=2;
        System.out.println("x in main " + x);
        printClassVariable();
    }
    static void printClassVariable(){
        System.out.println("printing class variable x " + x);
    }
}
