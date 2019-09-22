/*CSCI 1101-Project-Node
 *This program use a constructor to set values(a node content and a node), use a toString method to print out flights' information
 *Wenliang Jia, 15/04/2018
 *Hengpu Zhang,
 */
public class Node{
   //instance variables
   private Flights data;
   private Node next;
   //constructor
   public Node(){
   }
   public Node(Flights d, Node n){ 
      data = d; 
      next = n; 
   }
   //get and set methods
   public Flights getData(){
      return data;
   } 
   public Node getNext(){
      return next;
   }
   public void setData(Flights d){
      data = d;
   }
   public void setNext(Node n){
      next = n;
   } 
   //print out the node contents
   public String toString(){
      return data + " ";
   }
}//end class
