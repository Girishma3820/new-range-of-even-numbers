import java.util.Scanner;
public class Palindrome
{
    static boolean Palindrome(String str) 
    { 
    
        if(str.length() == 0 || str.length() == 1)
            return true; 
        
        if(str.charAt(0) == str.charAt(str.length()-1))
            return Palindrome(str.substring(1, str.length()-1));
        return false;
    }   
    
    public static void main(String args[]) 
    { 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();  
        if (Palindrome(str)) 
            System.out.println(str+" palindrome"); 
        else
            System.out.println(str+ " not a palindrome"); 
    }     
}
