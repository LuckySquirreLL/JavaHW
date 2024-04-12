import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Car car=new Car();
        System.out.println("Enter car collor");
        car.carColor(scanner.nextLine());
        System.out.println("Enter car model ");
        car.carModel=(scanner.nextLine());
        System.out.println("Enter horse power");
        car.setCarHorsePower(scanner.nextInt());
        System.out.println("Enter max speed?");
        car.setCarMaxSpeed(scanner.nextInt());
        System.out.println(car.carColor);
        System.out.println(car.carModel);
        System.out.println(car.getCarHorsePower());
        System.out.println(car.getCarMaxSpeed());


    }
}