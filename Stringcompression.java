import java.util.Scanner;
import java.util.*;
public class CompresString
{
    String s1 = "aaabbccddeeee ";
    public void compresString(String s1)
    {
        int count = 0;
        char temp = s1.charAt(0);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) == temp)
            {
                count++;
            }
            else
            {
                System.out.print(temp+""+count);
                count = 1;
                temp=s1.charAt(i);
            }
        }
         
    }
    public static void main(String args[])
    {
    CompresString obj=new CompresString();
    obj.compresString(obj.s1);
    }
}
