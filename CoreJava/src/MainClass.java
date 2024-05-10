class GreaterNumber {
	int num1, num2;  //instance variable
	GreaterNumber(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	GreaterNumber(){
		this(0,0);		
	}
	void checkGreater() {
		if(num1>num2) {
			System.out.println("Num1 is greater");
		} else {
			System.out.println("Num2 is greater");
		}
	}
	void checkGreater(int num1, int num2, int num3) {
		if (num1 >num2 && num1>num3) {
			System.out.println("Num1 is greater");
		} else if (num2>num1 && num2>num3) {
			System.out.println("Num2 is greater");
		} else {
			System.out.println("Num3 is greater");
		}
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GreaterNumber gn=new GreaterNumber();
			gn.checkGreater();
			gn.checkGreater(23,45,78);
			GreaterNumber gn1=new GreaterNumber(100,67);
			gn1.checkGreater();
			gn1.checkGreater(23,45,78);
			
	}

}
