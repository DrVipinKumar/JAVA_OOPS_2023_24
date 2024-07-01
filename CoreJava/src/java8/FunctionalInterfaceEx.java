package java8;
//interface Sum{
//	void add();
//	float PI=3.14f;
//	default void display() {
//		System.out.println("Default Method in Interface");
//		displayPrivate();
//	}
//	static void displayStatic() {
//		System.out.println("Static Method in Interface");
//	}
//	private void displayPrivate() {
//		System.out.println("Private Method in Interface");
//	}
//}

//class Calc implements Sum {
//
//	@Override
//	public void add() {
//		// TODO Auto-generated method stub
//		System.out.println("This is add method");
//	}
//	
//}
@FunctionalInterface
interface Mul {
	void multiply();
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Lambda Expression
		//with out parameter and without return value, single line
		Mul m =()-> System.out.println("this is Mul Interface");   
		m.multiply();
		//with out parameter and without return value, multiple line
		Mul m1 =()-> {
			System.out.println("this is Mul Interface");   
			System.out.println("this is Mul 2nd line Interface");  
		};
		m1.multiply();
		
		
		
//            Calc c =new Calc();
//            c.display();
//            Sum.displayStatic();
	}

}
