package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     List<String> names=Arrays.asList("Amit","Akash","Ravi","sunil");
		     names.stream().filter((name)->name.equalsIgnoreCase("Akash")).forEach(System.out::println);
//           List<Integer> data=Arrays.asList(10,15,16,19,20,20,8,8,6,11);
//           data.stream().distinct().limit(3).forEach(System.out::println);
           
//           int s = data.size();
//           int sum=data.stream().reduce(0, (c,e)->c+e); 
//           double avg=(double)sum/s;
           //           System.out.println(avg);
          // data.stream().filter((num)->num%2==0).forEach(System.out::println);  
//           List<Integer> evenNum=data.stream().filter((num)->num%2==0).collect(Collectors.toList()); 
//           System.out.println(evenNum);
//           int sumevenNum=data.stream().filter((num)->num%2==0).reduce(1, (c,e)->c*e); 
//           System.out.println(sumevenNum);
//           List<Integer> doubleNum=data.stream().map((num)->num*2).collect(Collectors.toList()); 
//           System.out.println(doubleNum);
           
	}

}
