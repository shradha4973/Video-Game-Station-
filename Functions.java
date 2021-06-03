public interface Functions{
    public String getGameStation();
    public String getVideoGame();
    public String getCustomerName();
    public String getCustomerType();
    public String getBookingDate();
    public int getDuration();
    public int getHourlyRate();
    public boolean getAvailableStatus();
    public void setName(String Name);
    public void setType(String Type);
    public void setRate(int Rate);
    public void book(String customerName,String customerType,String bookingDate,int duration );
    public void method();
    public void description();
    
}