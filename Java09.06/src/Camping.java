import java.util.Random;

public class Camping {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isYearFinished = random.nextBoolean();
        boolean isGoodWeather = random.nextBoolean();
        boolean hasBoughtRaincoasts = random.nextBoolean();
        boolean isJimFree= random.nextBoolean();
        boolean hasKateComeBack= random.nextBoolean();
        if (isYearFinished){
            System.out.println("YearFinished");
            if (isGoodWeather){
                System.out.println("Good weather");
                if((isJimFree)&(hasKateComeBack)){
                    System.out.println("Kate come back and Jim free this is bull shit");
                } else if ((isJimFree)&(!hasKateComeBack)) {
                    System.out.println("Jim is free and they come for a camping with kids");
                } else if ((!isJimFree) & (hasKateComeBack)) {
                    System.out.println("Kate hase come back and she come for a camping with kids");

                }
            } else if  (hasBoughtRaincoasts) {if((isJimFree)&(hasKateComeBack)){
                System.out.println("Raincoasts has bought");
                System.out.println("Kate come back and Jim free this is bull shit");
            } else if ((isJimFree)&(!hasKateComeBack)) {
                System.out.println("Jim is free and they come for a camping with kids");
            } else if ((!isJimFree)&(hasKateComeBack)) {
                System.out.println("Kate hase come back and she come for a camping with kids");

            }

        }

        }else System.out.println("kids cant come to camping");


            }



        }





