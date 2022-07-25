import java.util.Scanner;
public class Efficientfibonaccilab3 {
static BigInteger Efficientfibonaccilab3(int n)
{
BigInteger a =BigInteger.valueOf(0);
BigInteger b =BigInteger.valueOf(1);
BigInteger c =BigInteger.valueOf(1);
for (int j=2;j<=n;j++)

{
c= a.add(b);
a=b;
b=c;
}
return(b);
}
public static void main(String[] args) {
int n=100;
System.out.println(Efficientfibonaccilab3(n));