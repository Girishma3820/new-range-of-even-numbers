// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) {

        // taking input using scanner class
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while (testcases-- > 0) {

            // taking a,b,c
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // creating an object of class Geeks
            Geeks g = new Geeks();

            // calling the method bitWiseOp()
            // of class Geeks and passing
            // a,b,c as arguments
            g.bitWiseOperation(a, b, c);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Geeks {
    // Function to perform bitwise manipulations
    // a, b and c are input integers
    static void bitWiseOperation(int a, int b, int c) {

       int d=0,f=0,g=0,e=0;
             d = a ^ a;
            System.out.println(d);
e = c ^ b;
System.out.println(e);
f = a & b;
System.out.println(f);
g = c | (a ^ a);
System.out.println(g);
e = ~e;
System.out.println(e);
    }
}
