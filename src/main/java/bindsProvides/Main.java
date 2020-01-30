package bindsProvides;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Garage garage = DaggerGarage.create();
        Car car = garage.car();
        car.drive(100);
        Thread.sleep(10000);
        car.stop();
    }
}
