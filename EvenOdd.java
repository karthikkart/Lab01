import java.util.Scanner;
public class EvenOdd{
public static void main(String[] args)
{
	Scanner reader = new Scanner(System.in);
	System.out.print("enter a number:");
	int num = reader.nextInt();
	String EvenOdd = (num % 2 == 0) ? "Even" : "Odd";
	System.out.println(num + " is " + EvenOdd);
}
}