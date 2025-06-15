package switchstatment;
import java.util.Scanner;

public class swtchstametn {
    public static void main(String[] args){
        Scanner user =  new Scanner(System.in);
        System.out.println("Welscome to ticket check system");
        System.out.println("Note: ticket which you have, it id should be under 20. When ticket is entered it will give you several buses according to your distance from the bus stop.");
        System.out.println("Note: some ticketsId doesn't have bus availabe, according to the distance you entered.");
        System.out.print("Enter your ticket id: ");
        int ticketId = user.nextInt();
        System.out.print("Enter your distance from the bus stop: ");
        int setKm = user.nextInt();

        switchfactory ob = new switchfactory(ticketId, setKm);
        ob.ticketsystem();

        user.close();
    }
}