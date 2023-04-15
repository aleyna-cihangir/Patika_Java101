import java.util.Scanner;

import java.util.Scanner;
public class FindEvenValues2 {
    public static void main(String[] args) {
        int numbers, total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        numbers = input.nextInt();


        for(int i=0; i<=numbers; i++){
            if((i%2==0) && (i%4==0)){
                total += i;
            }
        }
        System.out.println("Total of numbers is :" + total);

    }
}
