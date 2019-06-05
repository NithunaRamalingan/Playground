import java.util.Scanner;
class Main {
public static void main (String[] args){
Scanner scanner=new Scanner(System.in);
int input=scanner.nextInt();
int temp;
for (temp = input; temp > 0;) 
{
if (temp < 99) 
{
System.out.println(temp % 10);
break;
} 
  else 
{
temp = temp / 10;
}
}
}
}