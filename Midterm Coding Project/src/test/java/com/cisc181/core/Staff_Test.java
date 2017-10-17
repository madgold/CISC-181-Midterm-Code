package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testStaffAverageSalary() throws PersonException {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		
		Staff One = new Staff("Juliette", "Susan", "Lassig", new Date(1995, 4, 12), "171 South Chapel Street, Newark, DE", "(516)-306-3723", "jlassig@udel.edu", "None", 1, 6000.00, new Date(2014, 4, 20), eTitle.MS);
		TestStaff.add(One);
		
		Staff Two = new Staff("Pam", "Grace", "Blandon", new Date(), "201 East Delaware Avenue, Newark, DE", "(203)-581-0526", "pblandon@udel.edu", "None", 2, 7000.00, new Date(), eTitle.MRS);
		TestStaff.add(Two);
		
		Staff Three = new Staff("Joran", "Rose", "Black", new Date(), "29 Blackwatch Rd, Morristown, NJ", "(973)-270-6471", "jordyx6@gmail.com", "None", 3, 8000.00, new Date(), eTitle.MS);
		TestStaff.add(Three);
		
		Staff Four = new Staff("Matthew", "Edward", "Johnson", new Date(), "45 North Chapel St, Newark, DE", "(908)-721-6009", "mattyj@udel.edu", "None", 4, 3000.00, new Date(), eTitle.MR);
		TestStaff.add(Four);
		
		Staff Five = new Staff("Gregory", "Michael", "Goldstein", new Date(), "16 East Cove Lane, Morristown, NJ", "(973)-668-9412", "ggoldstein@umd.edu", "None", 5, 9000.00, new Date(), eTitle.MR);
		TestStaff.add(Five);
		
		double AvgSalary = 0;
		for(Staff s : TestStaff) {
			AvgSalary += s.getSalary();
		}
		AvgSalary /= 5;
		
		int f = (int) AvgSalary;
		
		assertEquals(f, 6600);
	}
	
	@Test(expected = PersonException.class)
	public void testPhoneNumberException() throws PersonException {
		Staff Six = new Staff("Frankie", "P", "Robert", new Date(2500, 12, 14), "USA", "(1111)-111-1111", "random1@udel.edu", "None", 1, 4000, new Date(2014, 5, 24), eTitle.MR);	
}

	@Test
	public void testAgeException() throws PersonException {
		Staff Seven = new Staff("Drew", "Frederick", "Hahn", new Date(1699, 3, 29), "23 East Cove Lane, Morristown, NJ", "(973)-714-8343", "drewhahn@ucla.edu", "None", 6, 15000.00, new Date(), eTitle.MR);
	}

}
