package multithreadingex;
class MyThreadR implements Runnable {
	
	public void run () {
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class RunThreadByRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThreadR t1=new MyThreadR();
		 Thread tt1=new Thread(t1,"Thread 1");
		 tt1.start();
		 
         
    }

}
