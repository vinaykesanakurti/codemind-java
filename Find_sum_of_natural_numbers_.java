import java.util.Scanner;
class Main
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
            } 
            System.out.println(sum); 
            sc.close(); 
        
    }
    
}