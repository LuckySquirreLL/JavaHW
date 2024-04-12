import java.time.LocalDate;

public class BubbleSorter {
    public void sortMonth (LocalDate[] dates){
        for (int i = 0; i <dates.length-1 ; i++) {


            int j;
            for (j = 0; j < dates.length-i-1; j++) {
                int month = dates[j].getMonthValue();

                if (dates[j].getMonthValue()>dates[j+1].getMonthValue()) {
                    LocalDate x = dates[j];
                    LocalDate xplus =dates[j+1];
                    dates[j]=xplus;
                    dates [j+1]=x;
                }


            }
        }

    }}
