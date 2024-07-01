package genericex;
class Multiply {
	<T,Q>void mul(T num1, Q num2){
		double m=Double.valueOf(num1.toString())*Double.valueOf(num2.toString());
		System.out.println("Multiply="+m);
	}
}
class Add<T,Q>{
	T num1;
	Q num2;
	Add(T num1, Q num2){
		this.num1=num1;
		this.num2=num2;
	}
	void sum()
	{
		if(num1 instanceof Number) {
			double s=Double.valueOf(num1.toString())+Double.valueOf(num2.toString());
			System.out.println("Sum="+s);
		} else {
			System.out.println("Concat="+num1.toString()+" "+num2.toString());
		}
		
	}
}
public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Add<String,String> a1=new Add<String,String>("string","value");
		     a1.sum();
		     Add<Integer,Double> a2=new Add<Integer,Double>(45,89.45);
		     a2.sum();
		     Multiply m=new Multiply();
		     m.<Integer,Double>mul(23, 23.4);
         }
}
