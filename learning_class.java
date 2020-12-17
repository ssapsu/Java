package learning_class;	

public class learning_class {
	public static void main(String[] args)
	{
		Student a_student = new Student(17);
		Teacher b_teacher = new Teacher();
		System.out.print(a_student.getNumber());
		System.out.println();
		System.out.print(b_teacher.getNumber());
	}
}

class Student
{
	private int m_number;
	
	public Student(int _num)
	{
		super();
		m_number = _num;
	}
	
	public int getNumber()
	{
		return m_number;
	}
}

class Teacher
{
	public String getNumber()		//클래스는 변수뿐만 아니라 함수도 호출할 수 있다.
	{
		return "교장선생님";
	}
}
