// File references ENSF 409 Week 2 Content
// Lecture video: Lesson 25 - Scope
// Variables should be used at the innermost scope
// where it could be fully used
// Helps reduce errors
// More clarity on the programmer reading it
// Saves memory
// Variables will continue to use memory until
// it goes out of scope

/*
public class Example
{
    // too broad of scope covered for base var.
    // int base = 6;
    public void increment() {
        // too broad of scope covered for temp var.
        int base = 6;
        for (int i = 0; i < 5; i++) {
            int temp = base + i;
            System.out.println(temp);
        }
    }

    public static void main(String args[]) {
        Example test = new Example();
        test.increment();
    }
    // ------static vs. final variables--------//
    //static variables are class variables
    //these variables are shared within the same class
    //final variables CANNOT BE CHANGED once they are set
    //static AND final vars. are variables that cannot be changed
    //and are shared within the class
}
*/

public class Scope {
    public final int MAX_HEIGHT;
    public static int numObjects;

    public void Example(int height) {
        // set maximum height for this object
        this.MAX_HEIGHT = height;

        // Increment numObjects every time an object is instantiated
        numObjects++;
    }

    public static void main(String[] args) {
        var myObj1 = new Example(6);
        System.out.println("Obj1 - Height: " + myObj1.MAX_HEIGHT +
                " NumObj: " + myObj1.numObjects);

        var myObj2 = new Example(98);
        System.out.println("Obj2 - Height: " + myObj2.MAX_HEIGHT +
                " NumObj: " + Example.numObjects);

        System.out.println("Obj1 - Height: " + myObj1.MAX_HEIGHT +
                " NumObj: " + numObjects);
    }
}

/*
public class StaticArray
{
    public static int[] arrayFourElements() {
        // Create an array of integers containing the values shown
        int[] implicitLengthArray = {1,2,3,5};
        System.out.println("implicitLengthArray is an int array with 4 elements: ");
        // Iterate through the array and output the value.
        for (int tmpValue : implicitLengthArray) {
            System.out.println(tmpValue);
        }
        return impplicitLengthArray;
    }
    public static void main(String[] args) {
        // int arrays
        // we can call the arrayFourElements() method
        // without having to create an object and calling
        // the method on the object because the method is static
        // we don't have to specify the class we are using
        // when calling the method because the arrayFourElements method is in the
        // same class as this main method
        // usually we have to first create an object that references
        // the arrayFourElements() method but with the static
        // key word we don't have to
        // the static keyword can be used when there is code
        // shared across all instances of the class
        // the static keyword is used when there is no dependency on
        // object properties
        // ex. static methods can be used as static getters and setters
        // for static variables
        // the static keyword can be used as functions that are based on input
        // but don't need to draw upon the exclusive properties of objects
        // static methods cannot directly access instance methods at instance variables
        // static variables cannot use the this keyword because
        // they are part of the class instead of being part of an object
        // if the method takes no input and produces the same output
        // there is no reason to the method into an instance
        // static keyword makes it clear that the method
        // does not rely on object properties
        int[] implicitLengthArray = arrayFourElements();
    }
}
In Java, all variables have to be contained within a class or interface
You cannot declare a universally global variable in the program
You need to include static keyword within a class if you want more global access to info
Example below will give a compilation error:

// This variable needs to be contained in a static class
// to work as a global variable
public static final boolean thisWillNotWork = true;

public class Example {
    public final int MAX_HEIGHT;
    public static int numObjects;

    public Example(int height) {
        // set maximum height for this object
        this.MAX_HEIGHT = height;

        // Increment numObjects every time an object is instantiated
        numObjects++;
    }s

 */