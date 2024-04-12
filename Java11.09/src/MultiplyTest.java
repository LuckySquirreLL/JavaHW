import java.util.Scanner;

public class MultiplyTest {
    public static void main(String[] args) {

        System.out.println("Тест на знание таблицы умножения, " +
                "введите два числа и ответ, машина скажет правильный ли ответ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum=scanner.nextInt();
        System.out.println("Введите ответ");
        int answer=scanner.nextInt();
        int rightAnswer=firstNum*secondNum;
        if (rightAnswer == answer) {
            System.out.println("Правильной ответ!");

        }else {
            System.out.println("Вы ввели неправильный ответ, правильный ответ: "+rightAnswer);

        }



    }
}
