package school;

import util.Displayable;

public class Teacher extends Person implements Displayable {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Teacher() {
		
	}
	
	public Teacher(String firstName, String lastName, String subject) {
		
	}
	
	@Override
	public String display() {
		return getFullName() + " teaches " + getSubject();
	}
	

}
