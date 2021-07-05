import java.util.*;
public class array2
{
    public static void mystery(int[] arr)
    {
        int k = 0;
        for (int i: arr)
        {
            if (i != 0) 
            {
                arr[k++] = i;
            }
        }
        for (int i = k; i < arr.length; i++) 
        {
            arr[i] = 0;
        }
    }
     public static void main(String[] args)
    {
        int[] arr = { 6,5,0,2,8,7,0,4,9,0,3};
     mystery(arr);
        System.out.println(Arrays.toString(arr));
    }
}
