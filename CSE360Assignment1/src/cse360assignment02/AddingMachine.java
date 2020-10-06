package cse360assignment02;

/**
 * 
 * @author Sam Mennella
 *
 */
public class AddingMachine {
	/**
	 * Total keeps track of what the total number is after adding and subtracting different values
	 * Result adds to the string what numbers have been added and subtracted in order
	 */
  private int total;
  private String result;
  
  /*public static void main(String args[])
  {
	  AddingMachine am = new AddingMachine();
	  am.add(5);
	  System.out.println(am.getTotal());
	  am.subtract(3);
	  System.out.println(am.getTotal());
	  am.subtract(2);
	  System.out.println(am.getTotal());
	  am.add(1);
	  System.out.println(am.getTotal());
	  System.out.println(am.toString());
	  am.clear();
	  System.out.println(am.toString());
  }*/
  
  /**
   * <p> This is a constructor that sets default values to integer total (0) and string result ("")
   * </p>
   */
  public AddingMachine() {
    total = 0;  // not needed - included for clarity
    result = Integer.toString(0);
  }
  
  /**
   * <p> Returns the total of the numbers that were either added or subtracted onto the string
   * </p>
   * @return returns the current total of the operations
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * <p> Adds to the current total the value taken in as well as adds the number to the string with an addition sign
   * </p>
   * @param value the number we are going to add
   */
  public void add (int value) {
	  total = total + value;
	  result += " + ";
	  result += Integer.toString(value);
  }

  /**
   * <p> Subtracts the current total with the value taken in as well as subtracts the number to the string with a subtraction sign
   * </p>
   * @param value the number we are going to subtract
   */
  public void subtract (int value) {
	  total = total - value;
	  result += " - ";
	  result += Integer.toString(value);
  }

 /**
  * <p> Returns the string result that has been building up everytime the add or subtract method is called
  * </p>
  * @return result the string created from the add and subtract methods
  */
  public String toString () {
	  return result;
  }

  /**<p> When called, it makes the total nothing as well as makes result an empty string
   * </p>
   */
  public void clear() {
	  result = "";
	  total = 0;
  }
}