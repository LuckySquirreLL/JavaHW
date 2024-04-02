import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веведите значение в метрах");
        double meter = scanner.nextDouble();
        double killometer = meter / 1000;
        double mile = meter / 1609.34;
        double archin = meter * 1.41;
        System.out.println( killometer+"киллометров,"+ mile+"мили,"+ archin+"аршинов");
        }
