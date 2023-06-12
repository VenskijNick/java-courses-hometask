package Hometask_1;


import java.text.DecimalFormat;
import java.util.Scanner;


public class Converter {
    public static void main(String[] args) {
        double byn, rubExchange = 3.65, usdExchange = 2.925, oldUsdExchange=2.923,oldRubExchange=3.66;
        String rubResult, usdResult,change;
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        System.out.print("Enter money in BYN: ");
        byn = scan.nextDouble();
        rubResult = decimalFormat.format(byn*100 / rubExchange);
        usdResult = decimalFormat.format(byn / usdExchange);
        System.out.println(byn + " белорусских рублей - это " + usdResult + "$ или " + rubResult + " российских рублей.");

        if (usdExchange<oldUsdExchange){
            change = "уменьшился.";
        } else {change ="увеличился.";}
        System.out.println("Сегодняшний курс доллара 1$="+usdExchange+"$, вчерашний курс доллара 1$="+oldUsdExchange+"$ - курс "+change);
        if (rubExchange<oldRubExchange){
            change = "уменьшился.";
        } else {change ="увеличился.";}

        System.out.println("Сегодняшний курс российского рубля 100P="+rubExchange+", вчерашний курс российского рубля 100P="+oldRubExchange+" - курс "+change);

    }}