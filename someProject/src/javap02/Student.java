/**
 * 
 */
package javap02;

import com.mycompany.myapp.mycomp.Studying;

/**
 * @author old_lenovo
 *
 */
public class Student extends PersonBase implements person {

	
	private String grade;
	private String id;
	
	public Student()
	{
		//super();
		super("kamran", 10);
	}
	public Student(String _name, Integer _age)
	{
		super(_name, _age); // ref to the constructor from the parent class;
		
	}
	
//	public Student(String _name, Integer _age, String _grade)
//	{
//		super.name = _name;
//		super.age = _age;
//		grade = _grade;
//	}
	
	public Student(String _name, Integer _age, String _grade)
	{
		this(_name, _age); // ref to the constructor above;
		grade = _grade;
		
	}
	
	public Student(String _name, Integer _age, String _grade, String _id)
	{
		this(_name, _age, _grade);
		id = _id;
		
	}
	
	/* (non-Javadoc)
	 * @see javap02.person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see javap02.person#getAge()
	 */
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	public String Studyfor() {
		// TODO Auto-generated method stub
		return null;
	}

}
