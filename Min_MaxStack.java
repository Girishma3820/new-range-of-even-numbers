import java.util.*;
class Min_MaxStack
{
    public static void main(String args[])
    {
        System.out.println("Enter n Value:");
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        Stack st =new Stack<>();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println("Maximum Value: " +Collections.max(st));
        System.out.println("Minimum Value: " +Collections.min(st));
    }
}
