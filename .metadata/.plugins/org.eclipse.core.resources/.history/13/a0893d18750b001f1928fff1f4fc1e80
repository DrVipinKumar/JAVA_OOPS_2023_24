package encapsulation;

record Employee(String name,int eid, String company) {}

class Student {
	private String name;
	private int rollno;
	private String course;
	public Student() {
		super();
	}
	public Student(String name, int rollno, String course) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}
	public String getName() {   //getter
		return name;
	}
	public void setName(String name) {  //setter
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
		return "Student [name=" + name + ", rollno=" + rollno + ", course=" + course + "]";
	}
	
	
}

public class MainEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1=new Student();
			s1.setName("KIET");	
			s1.setRollno(1);
			s1.setCourse("MCA");
			System.out.println(s1.toString());
			Employee e1 =new Employee("XYZ",1,"KIET");
			System.out.println(e1);
			
		}
}
