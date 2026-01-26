public class CarFetch {
    void main(){

        CarDetails car1 = new CarDetails();
        car1.printCar();

        CarDetails car2 = new CarDetails("init","init","init");
        car2.printCar();

        car2.start();
        car2.stop();

        car2.setCar("Amaze","S","KL 22 R 7660");
        car2.printCar();

        CarDetails bike = new CarDetails("Activa i", "1", "KL 01 BP 7938");
        bike.printCar();
    }
}
