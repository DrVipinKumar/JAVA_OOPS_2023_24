class Sum{
public static void main(String args[])
{
 int s=0;
  if(args.length>0)
  {
     for(String num:args)
	 {
	    s=Integer.parseInt(num)+s;	 
	 }
	 System.out.println("Sum="+s);
  } else {
  
  System.out.println("Run like: Sum 10 20 30");
  }

}
}