import java.util.ArrayList;     //importing array list from library class 
import java.util.Collections;   //importing collection class
import java.util.Comparator;
//no 8
public class GameParlour implements Functions2{

     ArrayList<VideoGameStation> arr = new ArrayList<VideoGameStation>();    //creating array list to import attributes of previous class
//no 9     
public void addObject(String stationName, String videoGameName, int rate){            //method for adding new video game station in this list
    this.arr.add(new VideoGameStation(stationName, videoGameName, rate));  
}  
//no 10  
public void removeObject(int index){         //method for removing the object from the index 
    if(index<arr.size()){
    this.arr.remove(index);
    }
    else{
    System.err.println("Index number out of bound");
    }

} 
//no 11 
//method for storing the records of customer
public void store(int indexNo, String customerName, String customerType, String bookingDate, int duration){
       if(indexNo>=0 && indexNo<arr.size() ){
       VideoGameStation obj = arr.get(indexNo);
       obj.book(customerName,customerType,bookingDate, duration );
       arr.set(indexNo, obj);
    
    }
        else{
    System.err.println("Index Not Found");
    }
 
}
//no 12
//method for making the game station available for booking
public void free(int indexNo){
    if(indexNo>=0 && indexNo<arr.size()){
        VideoGameStation obj1 = arr.get(indexNo);
        obj1.method();
        arr.set(indexNo, obj1);
    }
    else{
    System.err.println("Index not found");
    }
}
//no 13
public void list(){       //method to list the objects of previous class when gamestation is available
    for(VideoGameStation v : arr){
        if(v.getAvailableStatus()==true){
           System.out.println(arr.indexOf(v));
           v.description();
        }
        else{
        System.out.println("Game Station not available");
        }
    }
}
//no 14
public void search(String name, int maxRate){       //function to search the game name and hourly rate in the list
      int a=0;
    for(VideoGameStation obj : arr){
        if(obj.getAvailableStatus()==true && obj.getGameStation().contains(name) && obj.getHourlyRate()<=maxRate){
           System.out.println(arr.indexOf(obj));
           obj.description();
           a++;
        }
        if(a==0){
            System.out.println("No item found.");
        }
        }

}
//no 15
public void order(){      //method to sort the objects in ascending order
    Collections.sort(arr);
}
public void ascending(){
   order();
    for(VideoGameStation st : arr){    //enhanced for loop with temporary object of video game station 
        if(st.getAvailableStatus()==false){
            System.out.println("Customer name: "+st.getCustomerName());
            System.out.println("Video game station: "+st.getGameStation());
        }
   
    }

}

}



