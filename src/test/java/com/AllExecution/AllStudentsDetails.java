package com.AllExecution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class AllStudentsDetails {

	public void getMethod0()
	{
		RestAssured.given().baseUri("http://localhost:8082").when().log().all().get("/students").then()
		.log().all().assertThat().statusCode(200);
	}	
	public void createMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.body(getFileContent("C:\\Users\\VDALAI\\eclipse-workspace\\STUDENTSMANAGEMENT\\src\\test\\resources\\post.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("/student").then().log().all();
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.body(getFileContent("C:\\Users\\VDALAI\\eclipse-workspace\\STUDENTSMANAGEMENT\\src\\test\\resources\\put.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/student/109").then().log().all();
	}

	public void deleteMethod()
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().log().all().delete("/student/109").then().log().all();
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();

}
}