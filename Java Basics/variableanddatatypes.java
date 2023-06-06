 /* variable are containers for storing data values.
 * variable must be specific data types.
 * Different data types: string, int, float(f), double(d)-> precision 15, char, boolean
 * String is not a primitive data type like int, double, or boolean
 * because it refers to an object.
 */


public class variableanddatatypes{
    public static void main(String[] args){
        String name = "srijan";  //name variable of type String is created and value is assigned.
        System.out.println(name);

        int num = 10;          // to store integer value.
        System.out.println(num);

        int num1=11;            
        num1=12;              //new value to existing variable will overwrite value.
        System.out.println(num1);

        float floatNum = 2.44f;  // to store floating point number.
        char myLetter = 'S';    // to store character.
        boolean bool = true;    // to store boolean value.

        System.out.println(floatNum);
        System.out.println(myLetter);
        System.out.println(bool);



        //To use the String class in your Java program, you can create a String object 
        //by using the new keyword and providing a string literal, like this:
        String greeting = new String("Hello, world!");
        System.out.println(greeting);
    }
}


//IDENTIFIERS (name given to the variables, method or class)
/*Java variables are identified with unique name.
 * These unique names are identifiers for e.g. x, y, sum, total, etc.
 * A variable is declared using an identifiers.
 * In above code name, num, num1, floatNum, bool are all identifiers.
 */