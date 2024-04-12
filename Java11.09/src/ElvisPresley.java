import java.util.Scanner;

//Элвис Пресли жил с 1935 по 1977 год. Используя тернарные операторы, напишите
//программу, в которой пользователь вводит год. Если указанный год меньше 1935, то
//вывести «Элвис ещё не родился». Если указанный пользователем год с 1935 по 1977
//включительно, то вывести «Элвис жив!». Если введённый пользователем год больше 1977,
//то вывести «Элвис навсегда в наших сердцах
public class ElvisPresley { public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Введите год, когда по вашему мнению Элвис был жив");
    int userAnswer = scanner.nextInt();
    if ((userAnswer>=1935) & (userAnswer<=1977)){
        System.out.println("В этот год элвис ещё жив");
    }else if(userAnswer<1935){
        System.out.println("Элвис ещё не родился");

    } else if (userAnswer>1977) {
        System.out.println("Элвис уже мёртв");

    }


}}
