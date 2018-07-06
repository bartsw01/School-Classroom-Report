package school;

import java.util.ArrayList;



public class Classroom {
	private int roomNumber;
	private String teacher;
	private ArrayList<Student> students;

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public Classroom() {
		
	}
	
	public Classroom(int roomNumber, String teacher) {
		
	}
	
	public String getClassroomNumberInfo() {
		return "Classroom number is: " + roomNumber;
	}

	

}
