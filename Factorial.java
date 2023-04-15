import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num,sum=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        num = input.nextInt();
        for(int i =1; i<=num; i++){
            sum *=i;
        }
        System.out.println("Factorial for "+num+ "! = " + sum);


    }
}
