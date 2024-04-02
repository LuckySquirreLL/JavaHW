import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость");
        double price = scanner.nextDouble();
        System.out.println("Введите сумму денег");
        double money = scanner.nextDouble();
        double change = money - price;
        int rubbles = (int) change;
        double coins = (change - rubbles)*10;
        System.out.println(rubbles);
        System.out.println(coins);

    }
}
