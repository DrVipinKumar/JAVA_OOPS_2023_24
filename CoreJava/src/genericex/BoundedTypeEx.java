package genericex;
class A {
	void display() {
		System.out.println("Class A");
	}
}
class SubA extends A {
	void display() {
		System.out.println("Class SubA");
	}
}
class B {
	void displayB() {
		System.out.println("Class B");
	}
}
class ChildA<T extends A>{
	T t1;
	ChildA(T t1){
		this.t1=t1;
	}
	void displayChildA() {
		System.out.println("This is ChildA");
		t1.display();
	}
}
public class BoundedTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   A a =new A();
		   SubA sa=new SubA();
		   B b =new B();
          ChildA<A> ca =new ChildA<A>(a);
          ca.displayChildA();
          ChildA<SubA> ca1 =new ChildA<SubA>(sa);
          ca1.displayChildA();
//          ChildA<B> ca2 =new ChildA<B>(b);
//          ca2.displayChildA();
	}
	

}
