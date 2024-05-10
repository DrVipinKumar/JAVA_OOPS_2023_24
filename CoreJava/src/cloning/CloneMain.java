package cloning;
class Sum implements Cloneable{
	int num1, num2;
	void getSum() {
		System.out.println("Sum="+(num1+num2));
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
           Sum s1 = new Sum();
           s1.num1=10;
           s1.num2=20;
           s1.getSum();
           Sum s4=(Sum)s1.clone();//deep copy
           s4.num1=50;
           s4.getSum();
           s1.getSum();
//           Sum s3 =new Sum();  
//           s3.num1=s1.num1;   //Deep Copy
//           s3.num2=s1.num2;
//           s3.num1=50;
//           s3.getSum();  
//           s1.getSum();
//           Sum s2=s1;  //Shadow Copy
//           s2.num1=40;
//           s2.getSum();
//           s1.getSum();
	}

}
