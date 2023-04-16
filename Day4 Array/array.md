# Array

Collection of similar type of data within a single variable.

### Syntax: 

        datatype[] variable_name = new datatype[size];

        int[] rollNo = new int[10]; 
        // or 
        int[] rollNo2 = {25,63,83,181,3};
### Breaking down the syntax: 

        int[] rollNo; // Declaration of array
                - Happens at compile time


        rollNo = new int[5];// initiatization // actually here object is being created in the heap memory
                - Happens at runtime
                - Memory is allocated at runtime means this is the dynamic memory allocation.
    - new is used to create an object

#### Note : In java array objects aren't continuous. Because
            - Array objects are created in heap memory
            - Heap objects aren't continuous according to JLS(Java Language Specification). 

