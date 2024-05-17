package exceptionpkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DivideBy {
	int num1, num2;
//	DivideBy(int num1, int num2){
//		this.num1=num1;
//		this.num2=num2;
//		}
	void getDivide() {
		System.out.println("Starting Division");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try {
			System.out.println("Enter number 1");
			num1=Integer.parseInt(br.readLine());
			System.out.println("Enter number 2");
			num2=Integer.parseInt(br.readLine());
		int result=num1/num2;
		System.out.println("Division="+(result));
		}catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
//			System.out.println(ae.toString());
			System.out.println("Divide by Zero");
		}catch(Exception io) {
			System.out.println(io);
		}
		finally {
			System.out.println("Under Finally Block");
		}
		System.out.println("End of Division");
	}
}
public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          DivideBy db=new DivideBy();
          db.getDivide();
	}

}
