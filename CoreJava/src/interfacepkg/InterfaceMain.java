package interfacepkg;

interface Calc {
	int num1=10; //public static final
	int getSum(int n1, int n2);  //public and abstract
	int getMul(int n1, int n2);
}


class Calculator implements Calc {

	@Override
	public int getSum(int n1, int n2) {
		// TODO Auto-generated method stub
		return (n1+n2);
	}

	@Override
	public int getMul(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calc.num1);
		Calculator c1 =new Calculator();
		System.out.println("Sum ="+c1.getSum(23,34));
		Calc c2=new Calc() {

			@Override
			public int getSum(int n1, int n2) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getMul(int n1, int n2) {
				// TODO Auto-generated method stub
				return (n1*n2);
			}
			
		};
		System.out.println("Multiply ="+c2.getMul(23,34));
	}

}
