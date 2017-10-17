package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	// You’ll need data to test ‘Student’.  This data should be available for all tests in the Student_Test class (hint: @BeforeClass).
	// Add three Course records, add them to an ArrayList of Course
	
	// Add two Semesters, one for Fall, one for Spring.  Add them to an ArrayList of Semester
	
	// Add two Sections for each Course & Semester (total of six Sections).  Add them to an ArrayList of Section
	
	
	// Create ten Student records, add them to an ArrayList of Student.

	static ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() throws PersonException{
		Course C1 = new Course(UUID.randomUUID(), "Discrete Mathematics", 3);
		Course C2 = new Course(UUID.randomUUID(), "General Chemistry", 4);
		Course C3 = new Course(UUID.randomUUID(), "Linear Algebra", 3);
		ArrayList<Course> CourseList = new ArrayList<Course>(3);
		
		CourseList.add(C1);
		CourseList.add(C2);
		CourseList.add(C3);
		
		Date FallStart = new Date(2017, 8, 30);
		Date FallEnd = new Date(2017, 12, 6);
		Semester Fall = new Semester(UUID.randomUUID(), FallStart, FallEnd);
		Date SpringStart = new Date();
		Date SpringEnd = new Date();
		Semester Spring = new Semester(UUID.randomUUID(), SpringStart, SpringEnd);
		ArrayList<Semester> SemesterList = new ArrayList<Semester>(2);
		SemesterList.add(Fall);
		SemesterList.add(Spring);
		
		Section DiscreteMath1 = new Section(C1.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 210);
		Section DiscreteMath2 = new Section(C1.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 210);
		Section GenChem1 = new Section(C2.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 106);
		Section GenChem2 = new Section(C2.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 106);
		Section LinAlg1 = new Section(C3.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 349);
		Section LinAlg2 = new Section(C3.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 349);
		ArrayList<Section> SectionList = new ArrayList<Section>(6);
		
		SectionList.add(DiscreteMath1);
		SectionList.add(DiscreteMath2);
		SectionList.add(GenChem1);
		SectionList.add(GenChem2);
		SectionList.add(LinAlg1);
		SectionList.add(LinAlg2);
		
		Student S1 = new Student("Brian", "A", "Tintea", new Date(), eMajor.CHEM, "427 Newark Ave", "123467890", "btintea@udel.edu");
		Student S2 = new Student("Sam", "B", "Hastings", new Date(), eMajor.BUSINESS, "117 East Cleavland Ave", "9735706146", "shastings@udel.edu");
		Student S3 = new Student("Megan", "C", "Kelly", new Date(), eMajor.NURSING, "207 South Chapel St", "9739063880", "mekelly@udel.edu");
		Student S4 = new Student("Josie", "D", "Angers", new Date(), eMajor.PHYSICS, "209 South Chapel St", "9708907513", "jangers@udel.edu");
		Student S5 = new Student("Caroline", "E", "Mezzonate", new Date(), eMajor.COMPSI, "50 Cleveland St", "3098278451", "cmezz@udel.edu");
		Student S6 = new Student("Andrew", "F", "Kaye", new Date(), eMajor.PHYSICS, "17 Annabelle St", "9735170988", "aokaye@udel.edu");
		Student S7 = new Student("Mike", "G", "Terreri", new Date(), eMajor.BUSINESS, "38 Continental Rd", "9734578133", "mterreri@udel.edu");
		Student S8 = new Student("Kian", "H", "Garemani", new Date(), eMajor.CHEM, "13 Center St", "9806142377", "kian@udel.edu");
		Student S9 = new Student("Bobby", "I", "Stewart", new Date(), eMajor.NURSING, "25 New London St", "3085732544", "bobbys@udel.edu");
		Student S10 = new Student("Jackie", "J", "Esposito", new Date(), eMajor.COMPSI, "119 East Cleveland Ave", "9075623400", "jespo@udel.edu"); 
		ArrayList<Student> StudentList = new ArrayList<Student>(10);
		
		StudentList.add(S1);
		StudentList.add(S2);
		StudentList.add(S3);
		StudentList.add(S4);
		StudentList.add(S5);
		StudentList.add(S6);
		StudentList.add(S7);
		StudentList.add(S8);
		StudentList.add(S9);
		StudentList.add(S10);
		
		for (Section section : SectionList) {
			for (Student student : StudentList) {
				EnrollmentList.add(new Enrollment(student.getStudentID(), section.getSectionID()));
			}
		}
}


	// Test Cases

	
	// Enroll the ten students you created in each of the Sections you created.  Grade each student (pick your own grade values).
	
	
	
	// Determine each student’s GPA, test it with an assertEquals.

	
	
	// Determine each course’s average grade, test it with an assertEqual.


	
	
	


}