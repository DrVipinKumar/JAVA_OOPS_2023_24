class Display{
	static String msg;
	static{
		System.out.println("In Static Block");
	}
	{//instance block 
		System.out.println("In Instance Block");
	}
	Display(){
		
	}
	Display(String msg){
		this.msg=msg;
		System.out.println("In Constructor");
	}
	void print() {
		System.out.println(msg);
	}
}
public class MainBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.msg="this is msg by static";
		     new Display("this is display1").print();
             new Display().print();
             
	}

}
