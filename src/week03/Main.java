package week03;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car[] carArray = new Car[3];
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for (Car car: carArray) {
            System.out.println("car.gear = " + car.gear);
        }

        System.out.println(car1); // week03.Car@5acf9800
    }
}
