import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String yesNo="Y";
        while (yesNo.equals("Y")){
            System.out.println("Choose one of the options - rock, paper, or scissors - to play against the computer. ");
            String userChoice = scanner.nextLine();
            int translate = 0;
            switch (userChoice) {
                case "rock":
                    translate = 1;
                    break;
                case "paper":
                    translate = 2;
                    break;
                case "scissors":
                    translate = 3;
                    break;
            }
            int computer = random.nextInt(3) + 1;
            //1rock 2paper 3scissors
            if ((translate == 1 & computer == 1 || translate == 2 & computer == 2) || translate == 3 & computer == 3)
            {
                System.out.println("This is draw " + translate + "  " + computer);

            } else if (translate == 1 & computer == 2 || (translate == 2) & (computer == 3) || translate == 3 & computer == 1)
            {
                System.out.println("You win " + translate + "   " + computer);
            } else {
                System.out.println("You loose " + translate + "   " + computer);


            }
            System.out.println("Do you want to continue? Insert Y/N");
            yesNo=scanner.nextLine();
        }




    }
}