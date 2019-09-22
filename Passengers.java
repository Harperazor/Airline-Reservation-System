/*CSCI 1101-Project-Passengers
This program use a constructor to set values(passengers' name,
age and phone number), use a toString method to print out 
passengers' information
Wenliang Jia, B00756205, 15/04/2018
Hengpu Zhang, B00754648,
Dongyuan Ren, B00752087
Haorui Yang, B00757933
*/
public class Passengers{
   //instance variables
   private String firstname;
   private String lastname;
   private String age;
   private String phone;
   //constructors
   public Passengers( String f, String l, String a, String p){
      firstname = f;
      lastname = l;
      age = a;
      phone = p;
   }
   //accessor methods
   public String getlastname(){//returns last name
      return lastname;
   }
   public String getfirstname(){//returns first name
      return firstname;
   }
   public String getage(){//returns age
      return age;
   }
   public String getphone(){//returns phone number
      return phone;
   }
   //mutator
   public void setlastname(String l){//sets last name
      lastname = l;
   }
   public void setfirstname(String f){//sets first name
      firstname = f;
   }
   public void setage(String a){//sets street name
      age = a;
   }
   public void setphone(String p){//sets phone number
      phone = p;
   }
     
   public String toString(){
      return lastname + "," + firstname + "\t\t\t" + age + "\t\t\t\t" + phone;
   }
}//end class