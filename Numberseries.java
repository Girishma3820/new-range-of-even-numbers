import java.util.Scanner;
import java.util.*;
public class Numberseries
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of rows:");
   int n=sc.nextInt();
   int s=0,i;
   for(i=1;i<=n;i++)
    {
     s=s*10+i;   
    System.out.println(s+" ");
}
}
}
