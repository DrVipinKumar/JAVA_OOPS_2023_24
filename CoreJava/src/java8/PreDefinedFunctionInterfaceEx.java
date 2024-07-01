package java8;
import java.util.function.*;


public class PreDefinedFunctionInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Function<Integer,Double> sq =(num)-> Double.valueOf(num*num);
          System.out.println("Square of 4="+ sq.apply(4));
          BiFunction<Integer,Integer,Double> sum=(n1,n2)-> Double.valueOf(n1+n2);
          System.out.println("Sum of 2 number="+ sum.apply(34,56)); 
          UnaryOperator<Integer> ad=(n1)-> n1+10;
          System.out.println("Add of 10="+ ad.apply(34)); 
          BiConsumer<Integer,Integer> sub=(n1, n2)->{
           	  System.out.println("Substraction="+(n1-n2));
          };
          sub.accept(23, 10);
         
	}

}
