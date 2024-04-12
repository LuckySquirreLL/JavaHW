import java.util.Random;

public class Friends {
    public static void main(String[] args){
    Random random = new Random();
    int money =0;
    int count;
    int i =0;
    for (;money<10000;i++){
    int cofficient = random.nextInt(4);
    switch (cofficient){
        case 0: money=money+50;
        break;
        case 1: money=money+100;
        break;
        case 2: money=money+200;
        break;
        case 3: money=money+500;
        break;
    }}
        System.out.println("Вы накопили нужную сумму, к вам пришло "+ i +" друзей");

}}
