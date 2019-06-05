import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sum;
	    for(sum=0 ;n!=0 ;n/=10)
	    {
		sum+=n%10;
	    }
	    System.out.println(sum);
	}
}