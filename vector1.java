import java.util.*;
public class vector1
{
 public static void main(String args[])
 {
  Vector v=new Vector();
  v.add(101);
  v.add("Rama");
  v.add(6.58);
  v.add(102);
  v.add("Gita");
  v.add(8.98);
  System.out.println(v);
  v.remove(4);
  System.out.println( " "+v);
  v.set(2,9.17);
  System.out.println( " "+v);
  v.contains("Sita");
  System.out.println(v.contains("Sita"));
  }
}
