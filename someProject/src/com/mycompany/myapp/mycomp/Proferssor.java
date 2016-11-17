/**
 * 
 */
package com.mycompany.myapp.mycomp;

import javap02.PersonBase;
import javap02.person;

/**
 * @author old_lenovo
 *
 */
public class Proferssor extends PersonBase implements person {
	
	private String title;
	
	public Proferssor(String _name, int _age, String _title) {
		super(_name, _age);
		title = _title;
		// TODO Auto-generated constructor stub
	}
	

	/* (non-Javadoc)
	 * @see javap02.person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Prof" + super.getName();
	}

	/* (non-Javadoc)
	 * @see javap02.person#getAge()
	 */
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	
	
	}

}
