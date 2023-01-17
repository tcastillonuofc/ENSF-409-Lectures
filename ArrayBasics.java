// File references ENSF 409 Week 2 Content
// Lecture video: Lesson 04- Arrays
// 1D and 2D arrays
//number of indexes are not explicit when declaring array
// imported library:create copies of unreferenced arrays
// use Arrays.copyof keyword
// Do not have the same file name or class name as a library name
import java.util.Arrays;
public class BasicArray{
    public static void main(String[] args) { //this line needed for code to work
        // array length determined by number of values provided
        int[] implicitLengthArray = {1, 2, 3, 5};

        // use a FOR EACH loop to enter values into array
        for (int tmpValue : implicitLengthArray) { //implicitLengthArray is referenced
            System.out.println(tmpValue);
        }

        // Dynamic allocation: reserving array space, not setting values
        // Array length CANNOT be changed
        int[] explicitLengthArray = new int[3]; // default value is 0 (int)
        // Use a CLASSIC for loop
        // array has built-in property of .length, a PROPERTY, NOT a method
        // arrays are NOT objects, we DON'T USE parentheses () to access it
        for (int i=0; i < explicitLengthArray.length ; i++) {
            System.out.println(explicitLengthArray[i]);
            // array index STARTS AT 0
            // array length = (last i value)+1
            explicitLengthArray[i] = 10 * i;
            //final index = 2
            System.out.println(explicitLengthArray[i]);
        }

        //we can change the arrays that are referenced in variables
        //Array object references new array of length 3(indeces 0,1,2)
        int[] explicitLengthArrayTwo = new int[3];
        //Now object references another new array of length 2(indeces 0,1)
        explicitLengthArrayTwo = new int[2];

        //Arrays are copied by reference
        //When you change values of a copied array,
        //You will also change the values of the original array
        //Because they reference the same underlying array.
        int[] explicitLengthArrayThree = new int[3];
        //Copy an array by reference
        int[] copyArray = explicitLengthArrayThree;
        //the value change will also be reflected in explicitLengthArrayThree
        copyArray[0] = 8000;
        //explicitLengthArrayThree[0] will also equal 8000
        System.out.println("Original array: " + explicitLengthArrayThree[0]);

        //copy unreferenced arrays
        //only copy first two elements
        int[] valueCopyArray = Arrays.copyOf(explicitLengthArray, 2);
        valueCopyArray[1] = 93;
        for (int tmpValue : valueCopyArray) {
            System.out.println(tmpValue);
        }
        //copy all elements
        int[] allElementsCopiedArray = Arrays.copyOf(explicitLengthArray, explicitLengthArray.length);
        System.out.print("All values copied: ");
        for (int tmpValue : allElementsCopiedArray) {
            System.out.print(tmpValue + " ");
        }
        System.out.println();
        System.out.println("Retained value: " + explicitLengthArray[1]);

        //copy ranges of array elements with copyOfRange keyword
        char[] originalCharArray = {'a','b','c','D','5'};
        //Arrays.copyOfRange(array_object, first inclusive index, last exclusive index)
        char[] subsetCharArray = Arrays.copyOfRange(originalCharArray,1,5);
        System.out.println("Subset values: ");
        for (char tmpValue : subsetCharArray) {
            System.out.print(tmpValue + " ");
        }
        System.out.println();

        //fill keyword: replace all elements with a specific value
        int[] arrayOne = {1,2,3,4,5};
        int[] arrayTwo = {6,7,8,9,10};
        //fill all arrayTwo elements with 11
        Arrays.fill(arrayTwo, 11);

        //Copy 2 elements starting from index 1 of arrayOne into arrayTwo
        //ArrayTwo element values starting from index 0 will be replaced
        System.arraycopy(arrayOne, 1, arrayTwo, 0, 2);
        System.out.println("arrayTwo with replaced values from arrayOne: ");
        for (int tmpValue : arrayTwo) {
            System.out.print(tmpValue + " ");
        }
        System.out.println();

        //---------multi-dimensional arrays-----------//
        //Like a table with rows and cols
        // can be more than 2D
        // each element references another array that may contain
        // another referenced array (D > 2) or values (D = 2)
        // each referenced array may have different array lengths
        // lowest structure level at the leftmost index
        // highest structure level at the rightmost index
        String nested[][] = {{"Apple", "Bread", "Corn"}, {"Aardvark", "Buffalo"}};
        //Iterating over arrays
        //left index represents outer array
        //right index represents inner array
        for (int i=0; i < nested.length; i++) {
            for(int j=0; j < nested[i].length; j++) {
                System.out.println("nested[" + i + "][" + j + "] " + nested[i][j]);
            }
        }

        //Dynamic allocation of arrays
        //outermost array length is 2 that each reference an array of length 2
        //innermost array has an undeclared length
        //innermost array length values will be dynamically allocated
        int intNested[][][];
        //each innermost array will be allocated different index lengths
        intNested[0][0] = new int[3];
        intNested[0][1] = new int[4];
        intNested[0][1] = new int[1];
        intNested[1][1] = new int[5];

    }
}


