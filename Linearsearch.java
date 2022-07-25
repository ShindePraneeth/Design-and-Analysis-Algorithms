import java.util.*;
class LinearSearch {
static int search(int arr[], int n, int x)
{
for (int i = 0; i < n; i++) {
if (arr[i] == x)
return i;
}
return -1;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Length of Array");
int l = sc.nextInt();
int[] arr = new int[l];
System.out.println("Enter the Numbers in Array");
for(int i = 0; i<l;i++){
arr[i] = sc.nextInt();
}
int n = arr.length;
System.out.println("Enter the Number to Search");
int x = sc.nextInt();
int index = search(arr, n, x);
if (index == -1)
System.out.println("Element is not present in the array");
else
System.out.println("Element found at position " + index);
}
}