/*CSCI 1101-Project-LinkedList
 *This program use a constructor to set values(a node content and a node), use a series of methods to form the linked list of nodes
  use a method called removeFront to remove the first node, use a method called removeLast to remove the last node
 *Wenliang Jia, 15/04/2018
 *Hengpu Zhang,
 */
public class LinkedList{
   //instance variables
   private Node front; 
   private int count; 
   //constructor 
   public LinkedList(){ 
      front = null;
      count = 0; 
   }
   //add a node to the front of the linked list
   public void addToFront(Flights d){
      Node n = new Node (d, front);
      front = n;
      count++;
   }
   //get the current size of the list
   public int size(){
      return count;
   }
   //check if the list is empty
   public boolean isEmpty(){
      return (count == 0);
   }
   //clear the list
   public void clear(){
      front = null;
      count = 0;
   }
   //get the content of the first node
   public Flights getFrontData(){
      return front.getData();
   }
   //get the first node
   public Node getFront(){
      return front;
   }
   //scan the list and print contents
   public void enumerate(){
      Node curr = front;
      int index = 1;
      while(curr != null){
         System.out.print(index + "." + curr + "\n");
         curr = curr.getNext();
         index++;
      }
      System.out.println();
   }
   //remove the first node
   public void removeFront(){
      if(!isEmpty()){
         front = front.getNext();
         count--;
      }
   }
   //remove the last node
   public void removeLast(){
      Node curr = front;
      while(curr.getNext().getNext() != null){
         curr = curr.getNext();
      }
      curr.setNext(null);
      count--;
   }
}//end class
