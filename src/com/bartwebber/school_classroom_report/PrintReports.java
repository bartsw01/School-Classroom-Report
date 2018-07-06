package com.bartwebber.school_classroom_report;

import java.util.ArrayList;
import java.util.List;

import school.Classroom;
import school.Student;
import util.Displayable;
import util.KeyboardReader;

public class PrintReports {
	public static void main(String[] args) {
		Classroom c = null;
		int roomNumber;
		String teacher;
		
		for (int i = 0; i < 3; i++) {
			teacher = KeyboardReader.getPromptedString("Enter Teacher's name: ");
			
			do {
				roomNumber = KeyboardReader.getPromptedInt("Enter Classroom number: ");
				if (roomNumber <=99) System.out.println("Classroom number must be 100 or higher.");
				
			} while (roomNumber <=99);
			c = new Classroom(roomNumber, teacher);
			System.out.println(c.getClassroomNumberInfo());
		}
	}
	
		
	

}
