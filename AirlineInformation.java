/*CSCI 1101-Project-AirlineInformation
This program use a constructor to initial an ArrayList, use
method called initial to add airline information to this 
ArrayList, use a method called size to return this list's
size, use a method called get to get airline information
Wenliang Jia, B00756205, 15/04/2018
Hengpu Zhang, B00754648,
Dongyuan Ren, B00752087
Haorui Yang, B00757933
*/
import java.util.ArrayList;//import the ArrayList class
public class AirlineInformation{
    //instance variables
    private ArrayList <Flights> airlist;
    //constructor
    public AirlineInformation(){
      airlist = new ArrayList<Flights>();
    }
    public void initial(){
       airlist.add(new Flights("Toronto", "1:25am - 2:55am", 247));
       airlist.add(new Flights("Toronto", "2:30am - 4:00am", 258)); 
       airlist.add(new Flights("Toronto", "6:30am - 8:00am", 263));  
       airlist.add(new Flights("Toronto", "11:25am - 12:55pm", 298));
       airlist.add(new Flights("Toronto", "12:25pm - 13:55pm", 288)); 
       airlist.add(new Flights("Toronto", "15:15pm - 16:45pm", 298));
       airlist.add(new Flights("Vancouver", "2:30am - 4:30am", 428));
       airlist.add(new Flights("Vancouver", "3:40am - 5:40am", 401));
       airlist.add(new Flights("Vancouver", "18:25pm - 20:25pm", 398));
       airlist.add(new Flights("Vancouver", "23:25pm - 1:25am(next day)", 356)); 
       airlist.add(new Flights("Ottawa", "7:15am - 8:35am", 212));
       airlist.add(new Flights("Ottawa", "9:30am - 10:50am", 258));
       airlist.add(new Flights("Ottawa", "21:40pm - 23:00pm", 200));
       airlist.add(new Flights("Ottawa", "22:30pm - 23:50pm", 198));
       airlist.add(new Flights("Ottawa", "22:55pm - 0:15am(next day)", 205)); 
       airlist.add(new Flights("Montreal", "4:50am - 6:10am", 196));
       airlist.add(new Flights("Sydney", "5:30am - 6:30am", 127));
       airlist.add(new Flights("Winnipeg", "8:05am - 9:35am", 297));
       airlist.add(new Flights("Hamilton", "10:25am - 12:15pm", 305));
       airlist.add(new Flights("Hamilton", "17:50pm - 19:30pm", 315));
       airlist.add(new Flights("Calgary", "13:55pm - 16:25pm", 398));
       airlist.add(new Flights("Edmonton", "14:35pm - 17:05pm", 366));
       airlist.add(new Flights("Quebec", "20:30pm - 22:00pm", 268));
    }
    //return the ArrayList's size
    public int size(){
      return airlist.size();
    }
    //used to get information in the ArrayList
    public Flights get(int i){
      return airlist.get(i);
    }
}//end class
    