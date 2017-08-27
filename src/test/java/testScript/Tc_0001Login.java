package testScript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageLibrary.SignIn;
import TestBase.TestBase;

class Tc_0001Login extends TestBase{
	
	@BeforeClass
	
	public void Setup() throws IOException{
		init();
	}
	
	/*@Test
	public void testLogin(){
		SignIn sign=new SignIn(driver);
		sign.clickonSignIn();
		sign.enterAllreadyRegisterUserEmail("test902@gmail.com");
		sign.enterAllReadyRegisteredPassword("password");
		sign.clickonSignInToAccount();
	}*/
	
	@Test
	public void testLogin(){
		SignIn sign=new SignIn(driver);
		sign.loginToApplication();
		sign.logout();
	}
	
	@AfterClass
	public void closebrowser(){
		closeBrowser();
	}
	
}