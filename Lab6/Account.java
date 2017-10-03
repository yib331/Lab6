/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 21 "code.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String name;
  private int account_number;
  private int activate_days;
  private String gender;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aName, int aAccount_number, int aActivate_days, String aGender)
  {
    name = aName;
    account_number = aAccount_number;
    activate_days = aActivate_days;
    gender = aGender;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccount_number(int aAccount_number)
  {
    boolean wasSet = false;
    account_number = aAccount_number;
    wasSet = true;
    return wasSet;
  }

  public boolean setActivate_days(int aActivate_days)
  {
    boolean wasSet = false;
    activate_days = aActivate_days;
    wasSet = true;
    return wasSet;
  }

  public boolean setGender(String aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getAccount_number()
  {
    return account_number;
  }

  public int getActivate_days()
  {
    return activate_days;
  }

  public String getGender()
  {
    return gender;
  }

  public void delete()
  {}

  // line 29 "code.ump"
   public String get_name(){
    
  }

  // line 32 "code.ump"
   public int get_account_number(){
    
  }

  // line 35 "code.ump"
   public String get_gender(){
    
  }

  // line 38 "code.ump"
   public int get_activate_days(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "account_number" + ":" + getAccount_number()+ "," +
            "activate_days" + ":" + getActivate_days()+ "," +
            "gender" + ":" + getGender()+ "]";
  }
}