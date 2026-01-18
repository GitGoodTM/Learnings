public class SubString {
    public static void main(String[] args){
        //.substring() extracts a predefined portion of a string
        String name = "K. S. Sooraj Kumar";
        System.out.println("Full name " + name);
        name.lastIndexOf(".");
        System.out.println("First Name : " + name.substring((name.lastIndexOf(".") + 2), name.lastIndexOf(" ")));
    }
}
