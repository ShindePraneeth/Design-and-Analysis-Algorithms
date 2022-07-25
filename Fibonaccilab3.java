import java.util.*;
public class Fibonaccilab3 {
static int Fibonaccilab3(int n){
if (n<=1)
return n;
return Fibonaccilab3(n-1) +Fibonaccilab3(n-2);
}
public static void main (String args[])
{
int n=20;
System.out.println(Fibonaccilab3(n));
}
}