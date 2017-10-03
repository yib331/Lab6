/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 41 "code.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int order_number;
  private String order_date;
  private int items_count;
  private String shipping_address;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aOrder_number, String aOrder_date, int aItems_count, String aShipping_address)
  {
    order_number = aOrder_number;
    order_date = aOrder_date;
    items_count = aItems_count;
    shipping_address = aShipping_address;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrder_number(int aOrder_number)
  {
    boolean wasSet = false;
    order_number = aOrder_number;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrder_date(String aOrder_date)
  {
    boolean wasSet = false;
    order_date = aOrder_date;
    wasSet = true;
    return wasSet;
  }

  public boolean setItems_count(int aItems_count)
  {
    boolean wasSet = false;
    items_count = aItems_count;
    wasSet = true;
    return wasSet;
  }

  public boolean setShipping_address(String aShipping_address)
  {
    boolean wasSet = false;
    shipping_address = aShipping_address;
    wasSet = true;
    return wasSet;
  }

  public int getOrder_number()
  {
    return order_number;
  }

  public String getOrder_date()
  {
    return order_date;
  }

  public int getItems_count()
  {
    return items_count;
  }

  public String getShipping_address()
  {
    return shipping_address;
  }

  public void delete()
  {}

  // line 49 "code.ump"
   public int get_order_number(){
    
  }

  // line 52 "code.ump"
   public void get_order_date(){
    
  }

  // line 55 "code.ump"
   public int get_items_count(){
    
  }

  // line 58 "code.ump"
   public void get_shipping_address(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "order_number" + ":" + getOrder_number()+ "," +
            "order_date" + ":" + getOrder_date()+ "," +
            "items_count" + ":" + getItems_count()+ "," +
            "shipping_address" + ":" + getShipping_address()+ "]";
  }
}