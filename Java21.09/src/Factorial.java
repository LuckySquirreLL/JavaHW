import java.util.Scanner;

public static void main(String[] args) {
    //factorial 1*2*3*4*5
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter factorial");
    int factorial = scanner.nextInt();
    long result=1;
    for (int count=1; count<=factorial;count++){
        result = count*result;
    }
    System.out.println(result);
}

