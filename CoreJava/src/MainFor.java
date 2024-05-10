class ForExample{
	//int data[]= new int[10];
	//int data[]= new int[] {12,34,56,77};
	int data[]= {12,34,56,77};
	void displayFor()
	{
//	  for(int i=0;i<data.length;i++) {
//		  System.out.println("data["+i+"]="+data[i]);
//	  }
		for(int value:data) {
			System.out.println("Value="+value);
		}
	}
}
public class MainFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ForExample fe=new ForExample();
           fe.displayFor();
	}

}
