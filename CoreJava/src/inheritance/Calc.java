package inheritance;
abstract class Sum {
	int num1, num2;
	void getSum(int num1, int num2) {
		System.out.println("Sum="+(num1+num2));
	}
	abstract void displaySum();
}
class SumSub extends Sum{
	SumSub(int num1, int num2){
		super.num1=num1;
		super.num2=num2;
	}

	@Override
	void displaySum() {
		// TODO Auto-generated method stub
		System.out.println("Sum="+(super.num1+super.num2));
	}
	
}
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumSub s1=new SumSub(23,45);
		s1.displaySum();
		s1.getSum(23,45);
		Sum s2= new Sum() {
			@Override
			void displaySum() {
				// TODO Auto-generated method stub
				System.out.println("Sum by Anonymous Sub Class="+(super.num1+super.num2));
			}
			
		};
		s2.num1=20;
		s2.num2=40;
		s2.displaySum();
		s2.getSum(45,67);
//         Sum s1;  //Object Declaration
//         s1=new Sum();  //Object Instantiation :- Wrong for abstract class
//         
//         Sum s2=new Sum();///Wrong for Abstract Class
	}

}
