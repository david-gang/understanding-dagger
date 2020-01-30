package helloWorld;

class Main {
    public static void main(String[] args) {
        Garage garage = DaggerGarage.create();
        Car car = garage.car();
        car.drive();
    }
}
