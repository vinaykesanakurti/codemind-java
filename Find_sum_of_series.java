import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        float sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(float)1/i;
            }
            System.out.format("%.2f",sum); 
            sc.close();
            }
    
}