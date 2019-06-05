import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);	
      int a= sc.nextInt();
      int ans=(a/100)+(a%10);
      System.out.println(ans);
	}
}