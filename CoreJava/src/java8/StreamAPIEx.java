package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Students {
	String name;
	int rollno;
	String course;
	public Students(String name, int rollno, String course) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", course=" + course + "]";
	}
	
}
class StreamAPIEx {
	public static void main(String args[]) {
		List<Students> students=Arrays.asList(
				       new Students("Abc1",1,"MCA"),
				       new Students("Abc2",2,"MCA"),
				       new Students("Abc3",5,"B.Tech"),
				       new Students("Abc4",7,"B.Tech"));
         for(Students s:students) {
        	 if(s.getRollno()>4) {
        		 System.out.println(s.getName());
        	 }
         }
         students.stream().filter((s)->s.getRollno()>4)
                           .forEach((s)->System.out.println(s.getName()));
         students.stream().filter((s)->s.getRollno()>4)
         .forEach(System.out::println);
//		ArrayList<Integer> data=new ArrayList<Integer>();
//		data.add(34);
//		data.add(23);
//		data.add(22);
//		data.add(21);
//		data.add(19);
//		List<Integer> values=Arrays.asList(23,45,67,12,24);
//		for(Integer num: values) {
//			if(num%2==0)
//			System.out.println(num);
		}
		
	}