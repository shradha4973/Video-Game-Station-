import java.io.Serializable;           //importing comparator class to determine the order of the objects

//no 1
public class VideoGameStation implements Serializable, Functions, Comparable<VideoGameStation>{
    //instance variable
        private String gameStation;
        private String videoGame;
        private String customerName;
        private String customerType;
        private String bookingDate;
        private int duration;
        private int hourlyRate;
        private boolean availableStatus;
//no 2
//constructor to set initial values
public VideoGameStation(String a, String b, int c){
    this.gameStation = a;
    this.videoGame = b;
    this.hourlyRate = c;
    this.customerName = "";
    this.customerType ="" ;
    this.bookingDate ="" ;
    this.duration = 0;
    this.availableStatus = true;
    
}
//no 3
//getter method for returning values
public String getGameStation(){
    return gameStation;
}
public String getVideoGame(){
    return videoGame;
}
public String getCustomerName(){
    return customerName;
}
public String getCustomerType(){
    return customerType;
}
public String getBookingDate(){
    return bookingDate;
}
public int getDuration(){
    return duration;
}
public int getHourlyRate(){
    return hourlyRate;
}
public boolean getAvailableStatus(){
    return availableStatus;
}
//no 4
//setter method for setting new values

public void setName(String Name){
        this.customerName=Name;
        }
public void setType(String Type){
        this.customerType=Type;
        }
public void setRate(int Rate){
        this.hourlyRate=Rate;
        }
//no 5   
//method to book the gaming station
public void book(String customerName,String customerType,String bookingDate,int duration ){
    if(availableStatus ==true){
    this.customerName=customerName;
    this.customerType=customerType;
    this.bookingDate=bookingDate;
    this.duration=duration;
    this.availableStatus=false;
}
else{
    System.out.println("Sorry, the game station is not available at the moment!!!");
    System.out.println("It will be available after "+this.duration+"at "+this.bookingDate);

}
}
//no 6
//method to check the booking status
public void method(){
if(availableStatus == false){
        this.customerName="";
        this.customerType="";
        this.bookingDate="";
        this.duration=0;
        this.availableStatus=true;
    
}
else{
     System.out.println("The game station is avaiable at the moment for booking!!");
}
 } 
 //no 7
  // method display the name and hourly rate  
public void description(){

    System.out.println("Name of Game Station: "+gameStation);
    System.out.println("Hourly Rate: "+hourlyRate);
}

//no 15
@Override
public int compareTo(VideoGameStation o){     //comparing the game station to sort them
    int i = 0;
    int n2=this.gameStation.compareToIgnoreCase(o.gameStation);
        if(n2!=0){
            i = n2;
        }
  
        return(i);

}
}
        
       







    




   









