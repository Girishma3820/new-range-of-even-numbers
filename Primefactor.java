import java.util.*;
class Primefactor
{
public static void main(String args[])
{
System.out.println("Enter Number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
while(n%2==0)
{
count+=1;
n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i+=2)
{
while(n%i==0)
{
count+=1;
n=n/i;
}
}
if(n>2)
count+=1;
System.out.println("Prime Factor Of a Given Number: " +count);
}
}
