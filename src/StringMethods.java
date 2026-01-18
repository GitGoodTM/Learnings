public class StringMethods {
    public static void main(String[] args){
        String name = "K. S. Sooraj Kumar";
        System.out.println("Name : " + name);
        System.out.println("Length of name : " + name.length());
        System.out.println("Character at 3rd position : " + name.charAt(3));
        System.out.println("Index of u : " + name.indexOf("u"));
        System.out.println("Last index of . : " + name.lastIndexOf("."));
        if(name.contains("x")){
            System.out.println("X is present at " + name.indexOf("X"));
        }else{
            System.out.println("X is not present, lets see if J is present");
            if(name.contains("j")){
                System.out.println("J is present at " + name.indexOf("j"));
            }
        }
    }
}

