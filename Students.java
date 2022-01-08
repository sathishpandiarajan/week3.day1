package week3.day1;

public class Students 
{
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is - "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id is - " +id+ " Student Name is - " +name);
	}
	
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("Student email id is - " +email+ " & Student phonenumber is - " +phoneNumber);
	}
	
	public static void main(String[] args) 
	{
		Students studentDetails = new Students();
		studentDetails.getStudentInfo(101);
		studentDetails.getStudentInfo(102, "Test Leaf");
		studentDetails.getStudentInfo("abcdef@gmail.com", 1234567890);
	}

}
