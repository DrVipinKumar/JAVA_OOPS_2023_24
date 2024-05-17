class ForExample{
	//int data[]= new int[10];
	//int data[]= new int[] {12,34,56,77};
	 // int data1[][]=new int [2][];
	int data[][]= {
			         {12,34},
			         {56,77}
			        };
	void displayFor()
	{
//	  for(int i=0;i<data.length;i++) {
//		  for (int j=0;j<data.length;j++)
//		  {
//		  System.out.println("data["+i+"]["+j+"]="+data[i][j]);
//		  }
//	  }
		for(int value[]:data) {
			for (int v:value) {
			System.out.println("Value="+v);
			}
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
