import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int temp= 1;
      for(int num=1; temp<=n; num=num+1)
      {
        if(num % 2==1)
        {
        System.out.println(num);
          temp=temp+1;
        }
      }
	}
}