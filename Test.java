//class to test the methods of searching and sorting in the game parlour class

public class Test{

    public static void main(String args []){
       GameParlour a= new GameParlour();     //creating the object of GameParlour class type to test its method
       a.addObject("Xbox", "gta 5", 3);         //adding the objects of VideoGameStation in the array list
       a.addObject("PlayStation", "pop", 5);
       a.addObject("Nintendo", "mario", 7);
       a.addObject("Arial", "mario", 7);
       a.addObject("Zennnn", "mario", 7);
       a.addObject("Xaox", "mario", 7);
      
       a.store(0, "customer2", "customer", "booking", 5);    //booking the stations in the arraylist
       a.store(1, "Acustomer6", "customer", "booking", 5);
       a.store(2, "Acustomer4", "customer", "booking", 5);
       a.store(3, "Acustomer6", "customer", "booking", 5);
       a.store(4, "Acustomer6", "customer", "booking", 5);
       a.store(5, "Acustomer6", "customer", "booking", 5);
       

       a.ascending();   //calling the method to sort the game stations in ascending order
       
    }
}