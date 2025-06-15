package switchstatment;

public class switchfactory {
    
    int setKm;
    int ticketId;

    public switchfactory(int ticketId,   int setKm){
        this.ticketId = ticketId;
        
        this.setKm = setKm;
    }

    public void ticketsystem(){
        if(ticketId <= 10){
            for(int i = ticketId; i <= 10; i++){
                switch(setKm) {
                    case 1:
                        if(1000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 2:
                        if(2000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 3:
                        if(3000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 4:
                        if(4000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 5:
                        if(5000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 6:
                        if(6000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 7:
                        if(7000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 8:
                        if(8000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 9:
                        if(9000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        }else {
                            System.out.println("Bus not found");
                        }
                        break;
                    default:
                        System.out.println("Invalid setKm value, please enter a value between 1 and 9.");
                        break;
                }
            }
        }
        else if(ticketId >= 10 && ticketId <= 20){
            for(int i = ticketId; i <= 20; i++){
                switch(setKm) {
                    case 1:
                        if(1000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 2:
                        if(2000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 3:
                        if(3000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 4:
                        if(4000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 5:
                        if(5000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 6:
                        if(6000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 7:
                        if(7000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 8:
                        if(8000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    case 9:
                        if(9000 % i == 0 ){
                            System.out.println("here is your bus number data "+ i + " for ticket id "+ ticketId);
                        } else {
                            System.out.println("Bus not found");
                        }
                        break;
                    default:
                        System.out.println("Invalid setKm value, please enter a value between 1 and 9.");
                        break;
                }
            }
        }
        else{
            System.out.println("Invalid ticket id, please enter a valid ticket id between 1 and 20.");
        }
    }
}