import java.util.Scanner;
public class FindEvenValues {
    public static void main(String[] args) {
        int numbers, count=0, total=0;
        double last_value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        numbers = input.nextInt();


        for(int i=0; i<=numbers; i++){
            if((i%3==0) && (i%4==0)){
                total += i;
                count ++;
            }
        }
        last_value = total /count;
        System.out.println("Average is :" + last_value);

    }
}
