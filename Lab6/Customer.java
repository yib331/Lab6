/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "code.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String customer_name;
  private int customer_age;
  private int annual_income;
  private int credit_score;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aCustomer_name, int aCustomer_age, int aAnnual_income, int aCredit_score)
  {
    customer_name = aCustomer_name;
    customer_age = aCustomer_age;
    annual_income = aAnnual_income;
    credit_score = aCredit_score;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCustomer_name(String aCustomer_name)
  {
    boolean wasSet = false;
    customer_name = aCustomer_name;
    wasSet = true;
    return wasSet;
  }

  public boolean setCustomer_age(int aCustomer_age)
  {
    boolean wasSet = false;
    customer_age = aCustomer_age;
    wasSet = true;
    return wasSet;
  }

  public boolean setAnnual_income(int aAnnual_income)
  {
    boolean wasSet = false;
    annual_income = aAnnual_income;
    wasSet = true;
    return wasSet;
  }

  public boolean setCredit_score(int aCredit_score)
  {
    boolean wasSet = false;
    credit_score = aCredit_score;
    wasSet = true;
    return wasSet;
  }

  public String getCustomer_name()
  {
    return customer_name;
  }

  public int getCustomer_age()
  {
    return customer_age;
  }

  public int getAnnual_income()
  {
    return annual_income;
  }

  public int getCredit_score()
  {
    return credit_score;
  }

  public void delete()
  {}

  // line 9 "code.ump"
   public String get_customer_name(){
    
  }

  // line 12 "code.ump"
   public int get_customer_age(){
    
  }

  // line 15 "code.ump"
   public int get_annual_income(){
    
  }

  // line 18 "code.ump"
   public int get_credit_score(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "customer_name" + ":" + getCustomer_name()+ "," +
            "customer_age" + ":" + getCustomer_age()+ "," +
            "annual_income" + ":" + getAnnual_income()+ "," +
            "credit_score" + ":" + getCredit_score()+ "]";
  }
}