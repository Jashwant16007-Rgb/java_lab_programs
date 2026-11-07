
import java.util.Scanner;
class test2 
{
int num,rem,sum;
public void cal() 
{
 System.out.println("Enetr a number:");
 Scanner sc = new Scanner(System.in); 
 num = sc.nextInt();
 while(num>0) 
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("the sum of didgits is:"+sum);
}

public static void main(String args[])
{
test2 ob = new test2();
ob.cal();
}
}