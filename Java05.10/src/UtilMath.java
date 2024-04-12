import com.sun.jdi.IntegerValue;

public class UtilMath {
    math math=new math();

    public static int addAll(int... nums){
        int sum = 0;
        for (int elem :nums) {
             System.out.println(sum+"+"+ elem);
            sum+=elem;
            System.out.println("="+sum);


        }
    return sum;
}
public static int minusAll(int minuend, int... subtrahend ){
        int subtrahend2=0;

        for (int elem:subtrahend) {
            subtrahend2+=elem;


        }

    return minuend-subtrahend2;
}



public static void powAll(int foundation, int... nums){

        for (int elem:nums)
        {
            double result = Math.pow((double) foundation,(double) elem);

            System.out.println((int)result);

        }

        }
    private int[] multAll;
    public int getMultAll() {
        int multiply=1;
        for (int elem:this.multAll) {
            multiply*=elem;
        }
        return multiply;
    }
    public void setMultAll(int... nums) {
        this.multAll=nums;
    }}



