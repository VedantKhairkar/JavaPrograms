import java.util.Scanner;
class Eo{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[]= new int[5];
System.out.println("Enter 5 number");
int start = 0 , end = a.length-1;
int ce = 0, co=0;
for(int i= 0;i<=a.length-1;i++)
{
 a[i]= sc.nextInt();
}
for(int i=0;i<=a.length-1;i++)
{
 if(a[i]%2==0)
{
	ce+=1;
}
else
{
	co+=1;
}
}
System.out.println("Even count"+ce);
System.out.println("Odd count"+co);
System.out.println("Vedant Khairkar");
}
}