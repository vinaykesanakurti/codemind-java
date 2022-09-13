import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        if(-1000<=N&&N<=1000)
        if(N>=0)
         System.out.println("Positive Number");
        else
             System.out.println("Negative Number");
       
        sc.close();
    }   
}