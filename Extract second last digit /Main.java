import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int num=(n%100);
      int n1=num/10;
      System.out.println(n1);
	}
}