package java8;
@FunctionalInterface
interface Sum{
	void add(int num1, int num2);
}
@FunctionalInterface
interface Div{
	int divison(int n1, int n2);
}
public class LambdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d1 =(n1,n2)-> {
			return (n1/n2);
		};
		System.out.println("Division="+d1.divison(231, 34));	
		
        Sum s1=(int n1, int n2)-> System.out.println("Sum="+(n1+n2));
        s1.add(23,45);
        Sum s2=(n1, n2)-> {
        	int s=n1+n2;
        	System.out.println("Sum="+(s));
        };
        s2.add(23,45);
	}

}
