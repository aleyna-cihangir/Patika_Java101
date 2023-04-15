import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year, learn your Chinese Zodiac... :)");
        year = input.nextInt();
        if(year%12==0){
            System.out.println("Your Chinese Zodiac is Rat");
        } else if (year%12==1) {
            System.out.println("Your Chinese Zodiac is Ox");
        }else if (year%12==2) {
            System.out.println("Your Chinese Zodiac is Tiger");
        }else if (year%12==3) {
            System.out.println("Your Chinese Zodiac is Rabbit");
        }else if (year%12==4) {
            System.out.println("Your Chinese Zodiac is Dragon");
        }else if (year%12==5) {
            System.out.println("Your Chinese Zodiac is Snake");
        }else if (year%12==6) {
            System.out.println("Your Chinese Zodiac is Horse");
        }else if (year%12==7) {
            System.out.println("Your Chinese Zodiac is Goat");
        }else if (year%12==8) {
            System.out.println("Your Chinese Zodiac is Monkey");
        }else if (year%12==9) {
            System.out.println("Your Chinese Zodiac is Rooster");
        }else if (year%12==10) {
            System.out.println("Your Chinese Zodiac is Dog");
        }else if (year%12==11) {
            System.out.println("Your Chinese Zodiac is Pig");
        }else {
            System.out.println("YWrong Information...");
        }













    }
}
