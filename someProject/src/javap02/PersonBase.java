/**
 * 
 */
package javap02;

/**
 * @author old_lenovo
 *
 */
public class PersonBase implements person {

	protected String name;
	protected int age;
	public PersonBase()
	{
		
	}
	public PersonBase(String _name, int _age)
	{
		name = _name;
		age = _age;
		
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
	public String getName(String _lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
