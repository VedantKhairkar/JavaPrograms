import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;
class Hash{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
int size = sc.nextInt();
System.out.println("Enter the num");
int arr[] = new int[size];
LinkedHashSet<Integer>Set=new LinkedHashSet<>();
for(int i =0;i<size;i++)
{
arr[i] = sc.nextInt();
Set.add(arr[i]);
}
int b[] = new int[Set.size()];
int j =0;
for(int item :Set)
{
b[j] = item;
j++;
}
System.out.println(Arrays.toString(b));
}
}

