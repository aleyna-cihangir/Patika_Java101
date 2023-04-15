import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year:");
        year = input.nextInt();
        if(year%4==0){
            System.out.println(year + " is a Leap Year.");
        } else if ((year%4==0) && (year%100==0)) {
            System.out.println(year + " is a Leap Year.");
        } else{
            System.out.println(year + " is a not Leap Year.");
        }


    }
}
