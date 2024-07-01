package multithreadingex;
class MyThreadR implements Runnable {
	
	public void run () {
		int p=Thread.currentThread().getPriority();
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" ,Priority="+p);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
	}
}
public class RunThreadByRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThreadR t1=new MyThreadR();
		 Thread tt1=new Thread(t1,"Thread 1");
		 tt1.setPriority(10);
		 tt1.start();
		 Thread tt2=new Thread(t1,"Thread 2");
		 tt2.start();
		 tt2.setPriority(1);
//		 Thread t2=new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<5;i++)
//				{
//				System.out.println(Thread.currentThread().getName());
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				}
//			}
//			 
//		 },"Thread by Annonymous Class");
//		 t2.start();		 
         
    }

}
