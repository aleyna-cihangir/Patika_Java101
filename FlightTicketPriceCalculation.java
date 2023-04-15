import java.util.Scanner;
import java.util.Calendar;
public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        // t_year = today year
        // c_year = customer year
        // l_price = last price

        int way, t_year, year;
        double new_price, l_price;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your flight Km :");
        int way_price = input.nextInt();
        new_price =  way_price*0.10;
        System.out.println("Flight Price is: " + new_price + " Euro");
        t_year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Please enter your birth year :");
        int c_year = input.nextInt();
        if((t_year - c_year) < 12 ){
            l_price = new_price - (new_price *0.5);
            System.out.println("Your Flight Ticket Price : " + l_price );
        } else if (24 <= (t_year - c_year) && ((t_year - c_year) >= 12 )  ) {
            l_price = new_price - (new_price *0.1);
            System.out.println("Your Flight Ticket Price : " + l_price );
        } else if ((t_year - c_year) >= 65 ) {
            l_price = new_price - (new_price *0.3);
            System.out.println("Your Flight Ticket Price : " + l_price );
        } else if (64 <= (t_year - c_year) && ((t_year - c_year) >= 25 )) {
            System.out.println("Your Flight Ticket Price : " + new_price );
        }  else {
            System.out.println("Wrong Information. Please enter your birth year...");
        }


    }
    
}
