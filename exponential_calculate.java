import java.util.Scanner;
public class exponential_calculate {
    public static void main(String[] args) {
        int num1, num2, m, k=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for exponential: ");
        num1 = input.nextInt();
        System.out.println("Enter exponential :");
        num2 = input.nextInt();

        for(m = num2; m > 0; m--){
            k = k * num1;
        }
        System.out.println("Result : " + k);



    }
}
