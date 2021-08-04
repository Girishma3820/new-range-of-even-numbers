// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
         int m=(int)n;
         long prefix[]=new long[m+1];
        prefix[0]=0;
        prefix[1]=1;
        for(int i=2;i<m+1;i++)
        {
            prefix[i]=(prefix[i-1]+prefix[i-2])% 1000000007;
        }
        return prefix[m];
    }
}
