/*converting a value of one data type to another data type.
 * Types: Implicit casting (widening conversion) --> automatic casting 
 * & Explicit casting (narrowing conversion) --> manual casting
 * 
 */

 public class typecast{
    public static void main(String[] args) {
      int myInt = 10;
      double myDouble = myInt; // automatic casting: int to double.

      System.out.println(myInt);
      System.out.println(myDouble);

   // narrowing casting can be done by placing the type in paranthesis in front of the value.

      double mDouble = 9.8d;
      int mInt = (int) mDouble; // manual casting: double to int

      System.out.println(mDouble);
      System.out.println(mInt);
   }
}

     
