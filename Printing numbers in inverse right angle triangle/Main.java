import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int no= n;
      for(int i=1; i<=n; i++)
      {
        for(int j=no; j>=1; j--)
        {
          System.out.print(j);
        }
        no--;
        System.out.println();
      }
	}
}