
public class EvenAndOdd {

	public static void main(String[] args) {
	int a=24;
	int b=31;
	int c=17;
	boolean d=even(a,b,c);
System.out.println(d);
	}
public static boolean even(int num1,int num2,int num3){
	if(num1%2 ==0){
	return true;
	}
	return false;
}
}
