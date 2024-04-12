
public class math {
    public static void main(String[] args) {
        UtilMath utilMath=new UtilMath();
        //addAll
        int[] numsArray = new int[]{2,4,6,8};
        UtilMath.addAll(numsArray);
        System.out.println( UtilMath.minusAll(60,numsArray));
        utilMath.setMultAll(numsArray);
        System.out.println(utilMath.getMultAll());
        UtilMath.powAll(2,numsArray);


}


}