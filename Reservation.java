/*CSCI 1101-Project-Reservation
 *This program use a constructor to initial a LinkedList (list), use the addFlights method to add flights in in alphabetical
  order, use the Cancel method to cancel booked flights, use the totalCost method to calculate the total costs, use the
  display method to print out all booked flights, use the size method to return the size of this likedlist
 *Wenliang Jia, 15/04/2018
 *Hengpu Zhang,
 */
public class Reservation{
   //instance variables
   private LinkedList list;
   //contrustors
   public Reservation(){
      list = new LinkedList();
   }
   //add all booked flights in alphabetical order
   public void addFlights(Flights f){
      Node n = new Node();
      Node curr = new Node();
      list.addToFront(f);
      curr = list.getFront();
      if(curr.getNext() == null){//conditional statement(check to see if true)
         return;
      }
      //add contact in alphabetical order(by destination)
      else if(curr.getData().getEndCity().compareTo(curr.getNext().getData().getEndCity()) > 0){
         n.setData(f);
         curr.setData(curr.getNext().getData());
         curr.getNext().setData(n.getData());
      }
      //add contact in alphabetical order(by travel time)
      else if(curr.getData().getEndCity().compareTo(curr.getNext().getData().getEndCity()) == 0){
         if(curr.getData().getTime().compareTo(curr.getNext().getData().getTime()) > 0){
            n.setData(f);
            curr.setData(curr.getNext().getData());
            curr.getNext().setData(n.getData());
         }
      }
   }
   //cancel booked flights
   public void Cancel(int i){
      Node curr = new Node();
      curr = list.getFront();
      int index = 1, count = list.size();
      //remove node at front
      if(i == 1){
         list.removeFront();
      }
      //remove node at last
      else if(i == count){
         list.removeLast();
      }
      //other conditions
      else{
         while(index != i - 1){
            curr = curr.getNext();
            index++;
         }
         curr.setNext(curr.getNext().getNext());
         count--;
      }
   }
   //calculate the total costs
   public double totalCost(){
      double total = 0;
      Node curr = list.getFront();
      while(curr != null){
         total = total + curr.getData().getCosts();
         curr = curr.getNext();
      }
      return total;
   }
   //print out all booked flights
   public void display(){
      if(list.isEmpty()){
         System.out.print("You have no reservation.");
      }
      else{
         System.out.println("Here are all your reservations: ");
         list.enumerate();
      }
   }
   //return the size of this likedlist
   public int size(){
      return list.size();
   }
}//end class
