import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        String[] StringArray=new String[6];
        StringArray[0]="AbcdefghAbc";
        StringArray[1]="Abcd";
        StringArray[2]="Abcde";
        StringArray[3]="Abcdef";
        StringArray[4]="Abcdefg";
        StringArray[5]="abc";
      int[] IntArray=new int[6];
        for (int i = 0; i <StringArray.length ; i++) {
            int wordLength=0;
            String word=StringArray[i];
            wordLength=word.length();
            IntArray[i]=wordLength;
        }
        Arrays.sort(IntArray);
        int lastValueArray=IntArray.length-1;
        int firstValueArray=0;
        for (int i = 0; i <IntArray.length ; i++) {
            int wordLength=0;
            String word=StringArray[i];
            wordLength=word.length();
            if (IntArray[lastValueArray]==wordLength){
                System.out.println("самое длинное слово:"+StringArray[i]);

            }
            if (IntArray[0]==wordLength){
                System.out.println("самое короткое слово:"+StringArray[i]);

        }


        }





    }
}
