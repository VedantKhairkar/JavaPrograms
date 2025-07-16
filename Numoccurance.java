import java.util.Scanner;
class Example{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int size = sc.nextInt();
int arr[] = new int [size];
System.out.println("Enter the elements of Array:");
for(int i=0;i<size;i++)
{
arr[i] = sc.nextInt();
}
 
System.out.println("Enter the target num:");
int count = 0;
int target = sc.nextInt();
for(int num:arr)
{
	if(num == target){
	count++;
}
}
System.out.println("Number of Occurance of "+target+" is "+count);
}
}
