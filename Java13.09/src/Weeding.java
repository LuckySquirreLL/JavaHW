import java.util.Scanner;

//Задание 1
//        Пользователь вводит, сколько лет он состоит в браке. Программа должна
//вывести, какая годовщина свадьбы будет у пользователя следующей (бумажная,
//  ситцевая, чугунная, серебряная и.д.). Не обязательно указывать все годовщины,
//достаточно 10-15. Узнать про годовщины можно,
public class Weeding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите годовщину свадьбы");
        int year = scanner.nextInt();
        String title="";
        switch (year){
            case 1: title="Ситцевая свадьба";
            break;
            case 2: title="Бумажная свадьба";
            break;
            case 3: title="Кожаная свадьба";
            break;
            case 4: title="Льняная свадьба";
            break;
            case 5: title="Деревянная свадьба";
            break;
            case 6: title="Чугунная свадьба";
            break;
            case 7: title="Медная свадьба";
            break;
            case 8: title="Жестяная свадьба";
            break;
            case 9: title="Фаянсовая свадьба";
            break;
            case 10: title="Оловянная свадьба";
            break;
            case 11: title="Стальная свадьба";
            break;}
            System.out.println(title);




        }


    }
