package java8;

@FunctionalInterface
interface Display {
	void msg();
}
class Message {
	Message(){
		System.out.println("This is constructor method for referencing example");
	}
	void displayMSG() {
		System.out.println("This is method referencing example");
	}
	static void dispMsg() {
		System.out.println("This is static method referencing example");
	}
}
public class MethodRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m1=new Message();
           Display m=m1::displayMSG;
           m.msg();
           Display m2 =Message::dispMsg;
           m2.msg();
           Display m3=Message::new;
           m3.msg();
	}

}
