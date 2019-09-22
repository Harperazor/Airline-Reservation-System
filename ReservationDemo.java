/*CSCI 1101-Project-ReservationDemo
 *This program use a Scanner object to ask users to input their basic information, use a while loop to book a flight,
  cancel a flight, show all reservations and quit the reservation system.
 *Wenliang Jia, 15/04/2018
 *Hengpu Zhang, 
 */
import java.util.Scanner;//import the Scanner class
import java.util.ArrayList;//import the ArrayList class
public class ReservationDemo{
   public static void main(String[]args){
      //declare the Scanner object
      Scanner keyboard=new Scanner(System.in);
      System.out.println("Welcome to Air Dal!\n\nPlease enter your information: ");
      System.out.print("Last name: ");
      String lastname=keyboard.next();
      System.out.print("First name: ");
      String firstname=keyboard.next();
      System.out.print("Age: ");
      String age=keyboard.next();
      System.out.print("Phone number: ");
      String phone=keyboard.next();
      //create a Passenger object
      Passengers p=new Passengers(firstname,lastname,age,phone);
      //create a Reservation object, which will contains a Linked List of user's reservation
      Reservation myList=new Reservation();
      System.out.println();
      System.out.println("Enter 1 to make the reservation");
      System.out.println("Enter 2 to cancel the reservation");
      System.out.println("Enter 3 to show all reservations");
      System.out.println("Enter 4 to quit");
      System.out.print("Enter: ");
      int operation=keyboard.nextInt();
      System.out.println();
      
      while(operation!=4){
         //make the reservation if user enter 1
         if(operation==1){
            System.out.print("Please enter your destination \n(choose from Toronto, Vancouver, Ottawa, Montreal, Sydney, Winnipeg, Hamilton, Calgary, Edmonton, Quebec):");
            String destination=keyboard.next();
            while(!destination.equals("Toronto") && !destination.equals("Vancouver") && !destination.equals("Ottawa") 
                  && !destination.equals("Montreal") && !destination.equals("Sydney") && !destination.equals("Winnipeg")
                  && !destination.equals("Hamilton") && !destination.equals("Calgary") && !destination.equals("Edmonton")
                  && !destination.equals("Quebec") ){
               System.out.print("Invalid destination! try again: ");
               destination=keyboard.next();
            }
            //initial the ArrayList of all flights
            AirlineInformation flightsAll=new AirlineInformation();
            flightsAll.initial();
            //create a new ArrayList that contains flights related to user's destination 
            ArrayList<Flights> searchedFlights= new ArrayList<Flights>();
            for(int i=0;i<flightsAll.size();i++){
               if(flightsAll.get(i).getEndCity().equals(destination)){
                  searchedFlights.add(flightsAll.get(i));
               }
            }
            //print all flights related to user's destination
            System.out.println("\nFlights to your destination:\n");
            int flightsIndex=1;
            for(int i=0;i<searchedFlights.size();i++){
               System.out.println(flightsIndex + ". " + searchedFlights.get(i));
               flightsIndex++;
            }
            //ask user which flight he want to book
            System.out.print("\nPlease enter the number which represents the flight you want to book :");
            int book=keyboard.nextInt();
            while(book<1 || book>searchedFlights.size()){
               System.out.print("Invalid number.Please try again: ");
               book=keyboard.nextInt();
            }
            myList.addFlights(searchedFlights.get(book-1));
            System.out.println("\nThe flight you just booked is:\n" + searchedFlights.get(book-1));
         }
         //cancel the reservation if user choose 2
         else if(operation==2){
            if(myList.size()!=0){
               myList.display();
               System.out.print("Please enter the number that you want to cancel: ");
               int cancelIndex=keyboard.nextInt();
               myList.Cancel(cancelIndex);
            }
            else{
               System.out.println("Your have no reservation.");
            }
         }
         //show all reservations if user choose 3
         else if(operation==3){
            myList.display();
            System.out.println("Total cost: $" + myList.totalCost());
         }
         else{
            System.out.println("Invalid number.Please enter 1-4.");
         }
         System.out.println("\nEnter 1 to make the reservation");
         System.out.println("Enter 2 to cancel the reservation");
         System.out.println("Enter 3 to show all reservations");
         System.out.println("Enter 4 to quit");
         System.out.print("Enter: ");
         operation=keyboard.nextInt();
         System.out.println();
      }
      System.out.println("\nName\t\t\t\tAge\t\t\t\tPhone");
      System.out.println(p);
      System.out.println();
      myList.display();
      System.out.println("Total cost: $" + myList.totalCost());
      System.out.println("\nThank you for choosing Air Dal! Good bye.");
   }
}//end class
