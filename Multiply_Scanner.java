import java.util.Scanner;
public class Multiply_Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
System.out.println("Enter two numbers.");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	System.out.println(multiply(a,b));
	}
public static int multiply(int num1,int num2){
	int product=(num1*num2);
	return product;
}
}
