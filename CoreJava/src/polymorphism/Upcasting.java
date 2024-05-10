package polymorphism;

class Area {
	int r,l,b;
	static void getArea() {  //over hiding, over Hidden
		System.out.println("For getting area");
	}
}
class Circle extends Area {
	void getArea(int r) {
		System.out.println("Area of Circle="+(Math.PI*r*r));
	}
	static void getArea() {
		System.out.println("In Cricle");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Area a1=new Area();
//       a1.getArea();
//       Circle c1 =new Circle();
//       c1.getArea(4);
       
     //  Circle c2 =(Circle) new Area();  //down casting
       Area a2 =new Circle();//up casting
       a2.getArea();
       
	}

}
