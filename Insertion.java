import java.lang.*;
public class insertion
{
  
    public static String insertString(String originalString,String stringToBeInserted,int index)
    {
   String newString = new String();
  
 for (int i = 0; i < originalString.length(); i++) {
  
  newString += originalString.charAt(i);
  
   if (i == index) {
  
   newString += stringToBeInserted;
   
   }
        }
  
        return newString;
    }
  
   public static void main(String[] args)
    {
  
    String input = "Very Good";
    String newstring = "hi";
    int position = 2;
  
    System.out.println("input: " + input);
    System.out.println("newstring: " + newstring);
    System.out.println("position: "+ position);
     System.out.println("output: "+ insertString(input,newstring,position));
    }
}
