import java.util.Scanner;
class authomorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,sqrt,r;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        sqrt=n*n;
        r=sqrt%(int)Math.pow(10,d);
        if(r==n) 
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
        }
    
}