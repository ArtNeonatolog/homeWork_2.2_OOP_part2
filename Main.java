import transport.Car;

public class Main {
    public static void main(String[] args) {

        task1();
    }
    private static void task1() {
        System.out.println();
        System.out.println("Задание 1");

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        car1.informationOfTheCar();
        System.out.println();
    }
}
