import java.util.Scanner;

public class NearTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа и программа выведет число, ближайшее к 10");
        System.out.print("Введите первое число: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNum = scanner.nextDouble();
        double firstBalance = Math.abs( 10 - firstNum);
        double secondBalance =Math.abs( 10 - secondNum);
        if (firstBalance > secondBalance) {
            System.out.println("Число "+secondNum+" Ближе к 10");

        } else if (firstBalance==secondBalance) {
            System.out.println("Оба числа одинакого близки к 10");

        } else {
            System.out.println("Число " + firstNum+ " Ближе к 10");
        }
}}