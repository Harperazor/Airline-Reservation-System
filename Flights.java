/*CSCI 1101-Project-Flights
 *This program use a constructor to set values(begining city, destination, time and costs), use a toString method to print 
  out flights' information
 *Wenliang Jia, 15/04/2018
 *Hengpu Zhang,
 */
public class Flights{
   //instance variables
   private String endCity;
   private String time;
   private double costs;
   //constructors
   public Flights(){
   }
   public Flights(String e, String t, double c){
      endCity = e;
      time = t;
      costs = c;
   }
   //set methods: set values(begining city, destination, time and costs)
   public void setEndCity(String e){
      endCity = e;
   }
   public void setTime(String t){
      time = t;
   }
   public void setCosts(double c){
      costs = c;
   }
   //get methods: get values(begining city, destination, time and costs)
   public String getEndCity(){
      return endCity;
   }
   public String getTime(){
      return time;
   }
   public double getCosts(){
      return costs;
   }
   //print out basic flights information
   public String toString(){
      return "Beginning: Halifax, Destination: " + endCity + ", Traveling time: " + time + ", Costs: $" + costs;
   }
}//end class
