package com.AllMethod;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.AllExecution.AllStudentsDetails;

public class AllExecutionDetails extends AllStudentsDetails {
	AllStudentsDetails s;
	@Test
	public void VerifyGet() throws FileNotFoundException {
		s=new AllStudentsDetails();
		s.getMethod0();
		}
	@Test(priority=1)
	public void VerifyPost() throws FileNotFoundException {
		s=new AllStudentsDetails();
		s.createMethod();
	}
	@Test(priority=2)
	public void VerifyPut() throws FileNotFoundException {
		s=new AllStudentsDetails();
		s.putMethod();
	}
	@Test(priority=3)
	public void VerifyDelete() {
		s=new AllStudentsDetails();
		s.deleteMethod();
	}
}