public interface Functions2{
    public void addObject(String stationName, String videoGameName, int rate);
    public void removeObject(int index);
    public void store(int indexNo, String customerName, String customerType, String bookingDate, int duration);
    public void free(int indexNo);
    public void list();
    public void search(String name, int maxRate);
    public void order();
    public void ascending();
    
    
    
    
}