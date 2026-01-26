public class CarDetails {

    static String name;
    static String variant;
    static String registrationNumber;

    CarDetails(){
        name="Alto";
        variant="VXi";
        registrationNumber="KL 01 BN 8452";
    }

    void start(){
        System.out.println("The engine is running");
    }
    void stop(){
        System.out.println("The engine has been stopped");
    }

    void setCar(String n, String v, String r){
        name=n;
        variant=v;
        registrationNumber=r;
    }
    void printCar(){
        System.out.println("Car details: ");
        System.out.println("Name: "+ name);
        System.out.println("Variant: "+ variant);
        System.out.println("Registration Number: "+ registrationNumber);
    }

    CarDetails(String name,String variant,String registrationNumber){
        this.name=name;
        this.variant=variant;
        this.registrationNumber=registrationNumber;
    }
}
