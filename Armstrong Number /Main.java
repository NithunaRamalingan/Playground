import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
  int n= sc.nextInt();
	   int num, remainder, result = 0;
       num = n;
        while (num != 0)
        {
            remainder = num % 10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }
        if(result == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}