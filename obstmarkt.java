import java.util.Scanner;
public class obstmarkt {
    public static void main(String[] args) {
        double apfel=2.30, berry = 3.45, total;
        Scanner input = new Scanner(System.in);
        System.out.println("How much kilo Apfel :");
        double ap = input.nextInt();
        System.out.println("How much kilo Berry :");
        double edbe = input.nextInt();

        total = (apfel*ap) + (berry*edbe);
        System.out.println("Total Price:" + total );
    }
}
