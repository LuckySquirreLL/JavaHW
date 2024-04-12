import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate[] dates = new LocalDate[8];
        dates[0] = LocalDate.of(12, 2, 1);
        dates[1] = LocalDate.of(16, 3, 20);
        dates[2] = LocalDate.of(200, 4, 13);
        dates[3] = LocalDate.of(304, 5, 14);
        dates[4] = LocalDate.of(205, 6, 19);
        dates[5] = LocalDate.of(995, 7, 30);
        dates[6] = LocalDate.of(331, 8, 3);
        dates[7] = LocalDate.of(223, 9, 5);
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
           BubbleSorter bubbleSorter=new BubbleSorter();
           bubbleSorter.sortMonth(dates);

        }

    }









        }
