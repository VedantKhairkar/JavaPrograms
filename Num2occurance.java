import java.util.Scanner;
class Num{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int size = sc.nextInt();
int arr[]= new int[size];
System.out.println("Enter the elements of array:");
for(int i= 0; i<size;i++)
{
 arr[i]=sc.nextInt();
}
System.out.println("Enter the target element");
int target = sc.nextInt();
boolean found = false;
int count = 0;
for(int i =0;i<size;i++)
{
	if(arr[i]==target)
	{
	count++;
	if(count==2)
	{
	
	System.out.println(target+" Occure 2nd time at "+i+" position");
	}
	found = true;
	}
}
if(!found){
System.out.println(target+" value does not occure twice");
}
}
}

