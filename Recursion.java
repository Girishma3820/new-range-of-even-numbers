import java.util.Scanner;

class recursion
{
	public static void main(String[] args) 
	{
		int i, a;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print("Enter Array Value: ");
		a = sc.nextInt();	
		
		int [] Array = new int[a];
		
		System.out.print("Enter Array Elements: ");
		for (i = 0; i < a; i++)
		{
			Array[i] = sc.nextInt();
		}     
	 
		System.out.println("\nArray Elements are:");
		for (i = 0; i < a; i++)
		{
			System.out.print(Array[i] + " ");
		}
	}
}
