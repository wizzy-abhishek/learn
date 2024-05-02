package dsa;

public class Array1 {
    /*
    Array is a collection of similar data
    stored in a contiguous mem allocation
     */
    // Syntax
    // datatype[] var_name = new datatype[] ;
    int[] number = new int[5] ;
    /*
    Here int[] number is declaring a reference of datatype int (happens at compile time)
    and new int[5] is creating the obj in heap memory (happens at run time)(also known as dynamic mem allocation)
    every time I input any value in number it simply refers it toward the allocated space in heap mem
    The new keyword is used to create an obj and allocate space in heap memory
    (According to me like I have understood creating an obj and allocating heap
    are almost same , some key points are :
    1. Runtime allocates the heap and return the memory location to a reference
    2. Object is about building an instance of class where heap allocation is getting memory space)
     */
    /*
    Generally , Array allocates continuous mem but in java there is not concept of pointers
    So its totally up to JVM (as heap and stack memory is created by JVM)
    if it allocates a continuous memory or not because
    1. Array object are stored in heap
    2. Heap obj are not continuous
    3. Java performs Dynamic mem allocation
     */
    int[] number2 = {1,2,3,4};
    /*
    In this case , we are creating an array using an initializer list.
    Java itself implicitly creates an array obj behind the sense and
    allocate memory in the heap .
     */
    /*
    There are some limited scenarios where Java implicitly creates an obj :
    1. String literals i.e, String s = " Java created an object inside ";
    2. Array literals i.e, int[] number = {1, 2};
    3. Autoboxing and Unboxing
     */
}
