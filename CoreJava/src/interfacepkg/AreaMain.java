package interfacepkg;

interface Rectangle {
	void getArea(Rectangle r);
}
interface Circle {
	void getArea(Circle c);
}
interface Area extends Rectangle, Circle{
	void getArea(Area a);
}

class Shape implements Rectangle,Circle {

	int l,b;
	int r;
	Shape(int l, int b){
		this.l=l;
		this.b=b;
	}
	Shape(int r){
		this.r=r;
	}
		
	@Override
	public void getArea(Circle c) {
		// TODO Auto-generated method stub
		System.out.println("Circle Area="+(Math.PI*r*r));
	}
	@Override
	public void getArea(Rectangle r) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area="+(l*b));
	}
		
}
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Shape s1= new Shape(2,5);
            ((Rectangle)s1).getArea(s1);
            Shape s2=new Shape(23);
            ((Circle)s2).getArea(s2);
	}

}
