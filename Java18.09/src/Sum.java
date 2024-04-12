import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter interval from:");
        int beginning = scanner.nextInt();
        System.out.println("to");
        int end = scanner.nextInt();
        int correctNum=0;
        String quit ="";
       do {
           for(int i=beginning;i<=end;i++){
               if (i%2!=0) {
                   correctNum=correctNum+i;
                   System.out.println(correctNum);

               }

           }
           System.out.println("Write Quit if you want to stop it. If you want to continue write any else");
           quit=scanner.nextLine();

       }while (!quit.equals("Quit"))
        ;

    }
}
