import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n;
System.out.println("enter two numbers");
n=sc.nextInt();
m=sc.nextInt();
while(m>=n)
{
if(m%2==0)
System.out.println(m+ " ");
m--;
}
}
}