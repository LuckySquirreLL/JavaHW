import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args){
        int[] Array= new int[8];
        Random random=new Random();
        for (int i=0;i<Array.length;i++){
            Array[i]=random.nextInt(100);

        }
        for (int i = 0; i <Array.length ; i++) {
            System.out.println(Array[i]);
        }
        for (int i = 0; i <Array.length ; i++)
        {
            if (Array[i]%2>=1){
                Array[i]=0;
            }

        }
        for (int i = 0; i <Array.length ; i++)
        {
            System.out.println(Array[i]);
        }

        Arrays.sort(Array);
        for (int i = 0; i <Array.length ; i++)
        {
            System.out.println(Array[i]);
        }



    }
}
