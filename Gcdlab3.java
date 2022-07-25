public class Gcdlab3 {
static int Gcdlab3(int a , int b){
if(a==0)
return b;
if(b==0)
return a;
if(a>b)
return Gcdlab3(a-b,b);
return Gcdlab3(a,b-a);
}
public static void main(String[]args)
{
int a=18524506,b=3485525;
System.out.println(Gcdlab3(a,b));
}
}