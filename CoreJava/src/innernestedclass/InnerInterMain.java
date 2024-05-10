package innernestedclass;

class Display {
	interface Message {
		void printMessage();
	}
}
public class InnerInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Display.Message m1=new Display.Message() {

			@Override
			public void printMessage() {
				// TODO Auto-generated method stub
				System.out.println("Nested Interface in Class");
			}	
        	  
          };
          m1.printMessage();
          }

}
