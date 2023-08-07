class student
{
	int rno;
    String sname;
    public student() {
    
		System.out.println("Default constructor");
	}
	public student(int rno, String sname) {
		this();//for calling default constructor
		System.out.println("Parameterized constructor");
		this.rno = rno;
		this.sname = sname;
	}
	void display()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
	}
    
}
public class thisDemo {
	public static void main(String[] args) {
		student s1=new student(1, "Anil");
		s1.display();
		
	}

}
