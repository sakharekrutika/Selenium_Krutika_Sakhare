package Day3;

import org.testng.annotations.Test;

public class MyFirstTestNGTest {
	
	
	@Test(priority = 1)
	public static void login() {
		System.out.println("Login");
	}
	
	@Test(priority = 2)
	public static void createAccount() {
		System.out.println("Account Created");
	}
	@Test(priority = 3)
	public static void deleteAccount() {
		System.out.println("Account Deleted");
	}
	@Test(priority = 4)
	public static void logoutFromApppLocation() {
		System.out.println("Logged out");
	}

	

}
