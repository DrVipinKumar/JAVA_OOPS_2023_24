package innernestedclass;
class Calculator{
	int num1, num2;
	void getResult() {
		class Div {
			int num1, num2;
			Div(int n1, int n2){
				num1=n1;
				num2=n2;
			}
			void getDiv() {
				System.out.println("Division="+(num1/num2));
			}
		}
		Div d1 =new Div(113,45);
		d1.getDiv();
	}
	class Sum {
		int num2=50;
		Sum(int n1, int n2){
			num1=n1;
			Calculator.this.num2=n2;
		}
		void getSum() {
			System.out.println("Sum="+(num1+Calculator.this.num2));
		}
	}	
	static class Multiply {
		int num1,num2;
		Multiply(int n1, int n2){
			num1=n1;
			num2=n2;
		}
		void getMultiply() {
			System.out.println("Multiply="+(num1*num2));
		}
	}
}

public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.getResult();
        Calculator.Sum s1=new Calculator().new Sum(20, 34);
          s1.getSum();
        Calculator.Multiply m1=new Calculator.Multiply(23, 45);
        m1.getMultiply();
	}

}
